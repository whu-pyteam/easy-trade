package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tyc
 * @date 2019/7/15 15:44
 */
@Data
public class FeedbackQueryParam
{
    @ApiModelProperty("反馈标题")
    private String aab503;

    @ApiModelProperty("反馈状态")
    private String aab504;

    @ApiModelProperty("pageSize")
    private Integer pageSize;

    @ApiModelProperty("pageNum")
    private Integer pageNum;

}
