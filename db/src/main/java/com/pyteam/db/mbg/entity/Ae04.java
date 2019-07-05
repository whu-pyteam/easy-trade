package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae04 implements Serializable {
    private Integer aae401;

    private Integer aad401;

    private Integer aad101;

    private static final long serialVersionUID = 1L;

    public Integer getAae401() {
        return aae401;
    }

    public void setAae401(Integer aae401) {
        this.aae401 = aae401;
    }

    public Integer getAad401() {
        return aad401;
    }

    public void setAad401(Integer aad401) {
        this.aad401 = aad401;
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
        sb.append(", aae401=").append(aae401);
        sb.append(", aad401=").append(aad401);
        sb.append(", aad101=").append(aad101);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}