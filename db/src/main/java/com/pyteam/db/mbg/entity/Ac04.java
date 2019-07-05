package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Ac04 implements Serializable {
    private Integer aac401;

    private Integer aac301;

    private Integer aac101;

    private Date aac402;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aac401=").append(aac401);
        sb.append(", aac301=").append(aac301);
        sb.append(", aac101=").append(aac101);
        sb.append(", aac402=").append(aac402);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}