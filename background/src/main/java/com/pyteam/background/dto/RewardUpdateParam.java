package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tyc
 * @date 2019/7/13 15:25
 */
@Data
public class RewardUpdateParam
{
    @ApiModelProperty("悬赏状态")
    private String status;
}
