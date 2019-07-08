package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Af09 implements Serializable {
    private Integer aaf901;

    private String aaf902;

    private String aaf903;

    private String aaf904;

    private static final long serialVersionUID = 1L;

    public Integer getAaf901() {
        return aaf901;
    }

    public void setAaf901(Integer aaf901) {
        this.aaf901 = aaf901;
    }

    public String getAaf902() {
        return aaf902;
    }

    public void setAaf902(String aaf902) {
        this.aaf902 = aaf902;
    }

    public String getAaf903() {
        return aaf903;
    }

    public void setAaf903(String aaf903) {
        this.aaf903 = aaf903;
    }

    public String getAaf904() {
        return aaf904;
    }

    public void setAaf904(String aaf904) {
        this.aaf904 = aaf904;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf901=").append(aaf901);
        sb.append(", aaf902=").append(aaf902);
        sb.append(", aaf903=").append(aaf903);
        sb.append(", aaf904=").append(aaf904);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}