package com.pyteam.background.controller;

import com.pyteam.commons.api.CommonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tyc
 * @date 2019/7/10 19:36
 */
@Api("RoleController--角色控制")
@RestController
@RequestMapping("/admin/role")
public class RoleController
{
    @ApiOperation("查询角色列表")
    public CommonResponse getRoleList()
    {
        return null;
    }
}
