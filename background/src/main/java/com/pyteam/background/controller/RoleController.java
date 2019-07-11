package com.pyteam.background.controller;

import com.pyteam.background.service.Af06Service;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Af06;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/10 19:36
 */
@Api(tags = "RoleController--角色控制")
@RestController
@RequestMapping("/admin/role")
public class RoleController
{
    @Autowired
    Af06Service af06Service;

    @ApiOperation("查询角色列表")
    @GetMapping
    public CommonResponse<List<Af06>> getRoleList()
    {
        return CommonResponse.success(af06Service.getRoleList());
    }
}
