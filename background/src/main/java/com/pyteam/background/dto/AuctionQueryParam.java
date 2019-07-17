package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tyc
 * @date 2019/7/15 9:05
 */
@Data
public class AuctionQueryParam
{

    @ApiModelProperty("拍卖名称")
    private String aad202;

    @ApiModelProperty("商品状态")
    private String aad209;

    @ApiModelProperty("pageSize")
    private Integer pageSize;

    @ApiModelProperty("pageNum")
    private Integer pageNum;
}
