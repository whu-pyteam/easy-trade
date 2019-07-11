package com.pyteam.background.controller;

import com.pyteam.background.dto.StaffLoginParam;
import com.pyteam.background.dto.UserInfo;
import com.pyteam.background.mapper.Af02Af09Mapper;
import com.pyteam.background.service.Af02Service;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Af02;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.expr.NewExpr;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * 后台员工控制
 * @author tyc
 * @date 2019/7/6 11:13
 */
@Log
@RestController
@Api(tags = {"LoginController -- 用户登入, 登出及信息管理"})
@RequestMapping("/admin")
public class LoginController
{
    @Autowired
    private Af02Service af02Service;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation("员工登录并返回token")
    @PostMapping("/login")
    public CommonResponse login(@RequestBody StaffLoginParam loginParam)
    {
        String token = af02Service.login(loginParam.getUsername(), loginParam.getPassword());
        if(token == null)
        {
            return CommonResponse.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>(2);
        tokenMap.put("tokenHead", tokenHead);
        tokenMap.put("token", token);

        return CommonResponse.success(tokenMap);
    }


    @ApiOperation("员工登出")
    @PostMapping("/logout")
    public CommonResponse logout()
    {
        return CommonResponse.success(null);
    }


    @ApiOperation("获取当前登录用户的信息")
    @GetMapping("/info")
    public CommonResponse getInfo(Principal principal)
    {
        String username = principal.getName();
        Af02 af02 = af02Service.getEmpByUsername(username);
        Map<String, Object> info = new HashMap<>();
        info.put("username", af02.getAaf202());
        info.put("nickname", af02.getAaf204());
        info.put("roles", af02Service.getPermissionList(af02.getAaf201()));
        info.put("status", af02.getAaf207());
        info.put("avatarUrl", af02.getAaf208());
        log.info("当前用户信息: " + info);
        return CommonResponse.success(info);
    }



    @ApiOperation("修改个人信息")
    @PutMapping("/info")
    public CommonResponse updateInfo(@RequestBody UserInfo userInfo)
    {
        Af02 af02Old = af02Service.getEmpByUsername(userInfo.getUsername());
        Af02 af02 = new Af02();
        af02.setAaf201(af02Old.getAaf201());
        af02.setAaf204(userInfo.getNickname());
        af02.setAaf208(userInfo.getAvatarUrl());
        System.out.println(af02);
        int res = af02Service.updateInfo(af02);
        log.info("修改个人信息: " + res);
        return CommonResponse.success(null, "修改成功");
    }


    @ApiOperation("新员工注册")
    @PostMapping("/register")
    public CommonResponse register(@RequestBody StaffLoginParam loginParam)
    {
        if(af02Service.register(loginParam))
        {
            return CommonResponse.success("注册成功");
        }
        else
        {
            return CommonResponse.failed("用户名重复");
        }
    }
}
