package com.pyteam.background.controller;

import com.pyteam.background.dto.StaffLoginParam;
import com.pyteam.background.mapper.Af02Af09Mapper;
import com.pyteam.background.service.Af02Service;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Af02;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
        info.put("permission", af02Service.getPermissionList(af02.getAaf201()));
        // TODO: 1. 完善 + icon
        return CommonResponse.success(info);

    }



    //TODO: 修改信息






}
