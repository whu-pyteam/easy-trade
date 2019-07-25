package com.pyteam.foreground.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Ac04Dto
{
    /**
     * 购物车项流水号
     */
    private Integer aac401;

    /**
     * 购物车流水号
     */
    private Integer aac301;

    /**
     * 商品流水号
     */
    private Integer aac101;

    /**
     * 创建时间
     */
    private Date aac402;
}
