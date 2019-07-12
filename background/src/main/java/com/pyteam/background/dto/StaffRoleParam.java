package com.pyteam.background.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/11 10:18
 */
@ApiModel("")
@Data
public class StaffRoleParam
{
    @ApiModelProperty("员工id")
    private Integer aaf201;

    @ApiModelProperty("角色id")
    private List<Integer> aaf601List;

    @ApiModelProperty("员工状态")
    private Integer aaf207;

}
