package com.pyteam.foreground.dto;

import lombok.Data;

import java.util.Date;

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

    public Integer getAac401() {
        return aac401;
    }

    public void setAac401(Integer aac401) {
        this.aac401 = aac401;
    }

    public Integer getAac301() {
        return aac301;
    }

    public void setAac301(Integer aac301) {
        this.aac301 = aac301;
    }

    public Integer getAac101() {
        return aac101;
    }

    public void setAac101(Integer aac101) {
        this.aac101 = aac101;
    }

    public Date getAac402() {
        return aac402;
    }

    public void setAac402(Date aac402) {
        this.aac402 = aac402;
    }
}
