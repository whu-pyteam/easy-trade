package com.pyteam.background.controller;

import com.pyteam.background.dto.StaffQueryParam;
import com.pyteam.background.dto.StaffRoleParam;
import com.pyteam.background.service.Af02Service;
import com.pyteam.background.service.Af07Service;
import com.pyteam.commons.api.CommonPage;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Af02;
import com.pyteam.db.mbg.entity.Af06;
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
@PreAuthorize("hasAuthority('admin:emp')")
public class StaffController
{

    private final Af02Service af02Service;
    private final Af07Service af07Service;

    public StaffController(Af02Service af02Service, Af07Service af07Service)
    {
        this.af02Service = af02Service;
        this.af07Service = af07Service;
    }

    @ApiOperation("分页查询员工列表")
    @GetMapping("")
    public CommonResponse<CommonPage<Af02>> list(StaffQueryParam queryParam)
    {
        List<Af02> list = af02Service.list(queryParam);
        return CommonResponse.success(CommonPage.restPage(list));
    }

    @ApiOperation("单例查询员工信息")
    @GetMapping("/{id}")
    public CommonResponse<Af02> getInfoById(@PathVariable("id") Integer id)
    {
        return CommonResponse.success(af02Service.getAf02ById(id));
    }


    @ApiOperation("更新员工角色")
    @PostMapping("/role")
    @PreAuthorize("hasAuthority('admin:emp')")
    public CommonResponse updateStaffRole(@RequestBody StaffRoleParam staffRoleParam)
    {
        Af02 af02 = af02Service.getAf02ById(staffRoleParam.getAaf201());
        af02.setAaf207(staffRoleParam.getAaf207());
        if(af07Service.staffRoleRelation(staffRoleParam) && af02Service.updateInfo(af02) == 1)
        {
            return CommonResponse.success("更新成功");
        }
        else
        {
            return CommonResponse.failed("操作失败");
        }
    }



    @ApiOperation("查询特定员工的角色")
    @GetMapping("/role/{id}")
    public CommonResponse<List<Af06>> list(@PathVariable("id") String id)
    {
        return CommonResponse.success(af02Service.getRoleList(Integer.valueOf(id)));
    }
}
