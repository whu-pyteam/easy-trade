package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tyc
 * @date 2019/7/13 10:08
 */
@Data
public class ProductUpdateParam
{
    @ApiModelProperty("商品id")
    private Integer id;

    @ApiModelProperty("商品状态")
    private String status;
}
