package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ad03 implements Serializable {
    private Integer aad301;

    private Integer aab101;

    private String aad302;

    private String aad303;

    private String aad304;

    private static final long serialVersionUID = 1L;

    public Integer getAad301() {
        return aad301;
    }

    public void setAad301(Integer aad301) {
        this.aad301 = aad301;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAad302() {
        return aad302;
    }

    public void setAad302(String aad302) {
        this.aad302 = aad302;
    }

    public String getAad303() {
        return aad303;
    }

    public void setAad303(String aad303) {
        this.aad303 = aad303;
    }

    public String getAad304() {
        return aad304;
    }

    public void setAad304(String aad304) {
        this.aad304 = aad304;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aad301=").append(aad301);
        sb.append(", aab101=").append(aab101);
        sb.append(", aad302=").append(aad302);
        sb.append(", aad303=").append(aad303);
        sb.append(", aad304=").append(aad304);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}