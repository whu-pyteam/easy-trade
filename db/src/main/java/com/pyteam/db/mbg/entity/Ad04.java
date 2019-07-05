package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ad04 implements Serializable {
    private Integer aad401;

    private Integer aab101;

    private String aad402;

    private static final long serialVersionUID = 1L;

    public Integer getAad401() {
        return aad401;
    }

    public void setAad401(Integer aad401) {
        this.aad401 = aad401;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAad402() {
        return aad402;
    }

    public void setAad402(String aad402) {
        this.aad402 = aad402;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aad401=").append(aad401);
        sb.append(", aab101=").append(aab101);
        sb.append(", aad402=").append(aad402);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}