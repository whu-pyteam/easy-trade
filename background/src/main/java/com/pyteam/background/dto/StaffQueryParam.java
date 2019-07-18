package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tyc
 * @date 2019/7/10 12:29
 */
@Data
public class StaffQueryParam
{
    @ApiModelProperty("员工名称")
    private String aaf202;

    @ApiModelProperty("员工昵称")
    private String aaf204;

    @ApiModelProperty("员工状态")
    private Integer aaf207;

    @ApiModelProperty("pageSize")
    private Integer pageSize;

    @ApiModelProperty("pageNum")
    private Integer pageNum;

}
