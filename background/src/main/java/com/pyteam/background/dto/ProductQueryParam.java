package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tyc
 * @date 2019/7/12 11:21
 */
@Data
public class ProductQueryParam
{
    @ApiModelProperty("商品名称")
    private String aac102;

    @ApiModelProperty("商品状态")
    private String aac104;

    @ApiModelProperty("pageSize")
    private Integer pageSize;

    @ApiModelProperty("pageNum")
    private Integer pageNum;
}
