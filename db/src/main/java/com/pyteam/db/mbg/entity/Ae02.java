package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae02 implements Serializable {
    private Integer aae201;

    private Integer aad301;

    private Integer aad101;

    private static final long serialVersionUID = 1L;

    public Integer getAae201() {
        return aae201;
    }

    public void setAae201(Integer aae201) {
        this.aae201 = aae201;
    }

    public Integer getAad301() {
        return aad301;
    }

    public void setAad301(Integer aad301) {
        this.aad301 = aad301;
    }

    public Integer getAad101() {
        return aad101;
    }

    public void setAad101(Integer aad101) {
        this.aad101 = aad101;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aae201=").append(aae201);
        sb.append(", aad301=").append(aad301);
        sb.append(", aad101=").append(aad101);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}