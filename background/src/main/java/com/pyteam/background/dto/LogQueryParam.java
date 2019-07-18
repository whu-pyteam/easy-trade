package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author tyc
 * @date 2019/7/16 14:42
 */
@Data
public class LogQueryParam
{
    @ApiModelProperty("员工名称")
    private String aaf202;

    @ApiModelProperty("开始时间")
    private Date dateBegin;

    @ApiModelProperty("结束时间")
    private Date dateEnd;

    @ApiModelProperty("pageSize")
    private Integer pageSize;

    @ApiModelProperty("pageNum")
    private Integer pageNum;
}
