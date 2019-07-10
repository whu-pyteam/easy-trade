package com.pyteam.background.controller;

import com.pyteam.background.dto.StaffQueryParam;
import com.pyteam.background.service.Af02Service;
import com.pyteam.commons.api.CommonPage;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Af02;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/8 9:15
 */
@Api(tags = {"StaffController -- 员工管理"})
@RestController
@RequestMapping("/staff")
public class StaffController
{

    @Autowired
    Af02Service af02Service;

    @ApiOperation("分页查询员工列表")
    @GetMapping("")
    @PreAuthorize("hasAuthority('admin:emp')")
    public CommonResponse<CommonPage<Af02>> list(StaffQueryParam queryParam)
    {
        List<Af02> list = af02Service.list(queryParam);
        return CommonResponse.success(CommonPage.restPage(list));
    }

}
