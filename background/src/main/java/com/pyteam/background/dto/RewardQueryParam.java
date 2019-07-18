package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tyc
 * @date 2019/7/13 14:09
 */
@Data
public class RewardQueryParam
{
    @ApiModelProperty("悬赏名称")
    private String aad105;

    @ApiModelProperty("悬赏审核状态")
    private String aad102;

    @ApiModelProperty("pageSize")
    private Integer pageSize;

    @ApiModelProperty("pageNum")
    private Integer pageNum;
}
