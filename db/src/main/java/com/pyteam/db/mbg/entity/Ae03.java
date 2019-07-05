package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae03 implements Serializable {
    private Integer aae301;

    private Integer aad301;

    private Integer aad201;

    private static final long serialVersionUID = 1L;

    public Integer getAae301() {
        return aae301;
    }

    public void setAae301(Integer aae301) {
        this.aae301 = aae301;
    }

    public Integer getAad301() {
        return aad301;
    }

    public void setAad301(Integer aad301) {
        this.aad301 = aad301;
    }

    public Integer getAad201() {
        return aad201;
    }

    public void setAad201(Integer aad201) {
        this.aad201 = aad201;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aae301=").append(aae301);
        sb.append(", aad301=").append(aad301);
        sb.append(", aad201=").append(aad201);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}