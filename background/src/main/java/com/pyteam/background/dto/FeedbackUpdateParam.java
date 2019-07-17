package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tyc
 * @date 2019/7/15 18:16
 */
@Data
public class FeedbackUpdateParam
{
    @ApiModelProperty("反馈状态")
    private String status;

    @ApiModelProperty("反馈回复信息")
    private String reply;
}
