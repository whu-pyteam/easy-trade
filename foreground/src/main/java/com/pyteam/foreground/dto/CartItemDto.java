package com.pyteam.foreground.dto;

import lombok.Data;

import java.math.BigDecimal;

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

    /**
     * 卖家流水号
     */
    private Integer aab101;

    /**
     * 卖家昵称
     */
    private String aab103;

    public Integer getAac101() {
        return aac101;
    }

    public void setAac101(Integer aac101) {
        this.aac101 = aac101;
    }

    public String getAac106() {
        return aac106;
    }

    public void setAac106(String aac106) {
        this.aac106 = aac106;
    }

    public String getAac102() {
        return aac102;
    }

    public void setAac102(String aac102) {
        this.aac102 = aac102;
    }

    public BigDecimal getAac105() {
        return aac105;
    }

    public void setAac105(BigDecimal aac105) {
        this.aac105 = aac105;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAab103() {
        return aab103;
    }

    public void setAab103(String aab103) {
        this.aab103 = aab103;
    }
}
