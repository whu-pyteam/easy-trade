package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

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

    @ApiModelProperty("开始时间")
    private Date dateBegin;

    @ApiModelProperty("结束时间")
    private Date dateEnd;

    @ApiModelProperty("pageSize")
    private Integer pageSize;

    @ApiModelProperty("pageNum")
    private Integer pageNum;

}
