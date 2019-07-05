package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae05 implements Serializable {
    private Integer aae501;

    private Integer aad401;

    private Integer aad201;

    private static final long serialVersionUID = 1L;

    public Integer getAae501() {
        return aae501;
    }

    public void setAae501(Integer aae501) {
        this.aae501 = aae501;
    }

    public Integer getAad401() {
        return aad401;
    }

    public void setAad401(Integer aad401) {
        this.aad401 = aad401;
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
        sb.append(", aae501=").append(aae501);
        sb.append(", aad401=").append(aad401);
        sb.append(", aad201=").append(aad201);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}