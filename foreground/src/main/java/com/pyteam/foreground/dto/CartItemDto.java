package com.pyteam.foreground.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto
{
    /**
     * 商品流水号
     */
    private Integer aac101;

    /**
     * 商品图片url
     */
    private String aac106;

    /**
     * 商品名称
     */
    private String aac102;

    /**
     * 商品价格
     */
    private BigDecimal aac105;

}
