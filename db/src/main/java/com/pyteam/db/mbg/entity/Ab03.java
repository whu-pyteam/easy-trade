package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ab03 implements Serializable {
    private Integer aab301;

    private Integer aab101;

    private String aab302;

    private String aab303;

    private Integer aab304;

    private Integer aab305;

    private Integer aab306;

    private String aab307;

    private static final long serialVersionUID = 1L;

    public Integer getAab301() {
        return aab301;
    }

    public void setAab301(Integer aab301) {
        this.aab301 = aab301;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAab302() {
        return aab302;
    }

    public void setAab302(String aab302) {
        this.aab302 = aab302;
    }

    public String getAab303() {
        return aab303;
    }

    public void setAab303(String aab303) {
        this.aab303 = aab303;
    }

    public Integer getAab304() {
        return aab304;
    }

    public void setAab304(Integer aab304) {
        this.aab304 = aab304;
    }

    public Integer getAab305() {
        return aab305;
    }

    public void setAab305(Integer aab305) {
        this.aab305 = aab305;
    }

    public Integer getAab306() {
        return aab306;
    }

    public void setAab306(Integer aab306) {
        this.aab306 = aab306;
    }

    public String getAab307() {
        return aab307;
    }

    public void setAab307(String aab307) {
        this.aab307 = aab307;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aab301=").append(aab301);
        sb.append(", aab101=").append(aab101);
        sb.append(", aab302=").append(aab302);
        sb.append(", aab303=").append(aab303);
        sb.append(", aab304=").append(aab304);
        sb.append(", aab305=").append(aab305);
        sb.append(", aab306=").append(aab306);
        sb.append(", aab307=").append(aab307);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}