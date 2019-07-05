package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Af04 implements Serializable {
    private Integer aaf401;

    private String aaf402;

    private static final long serialVersionUID = 1L;

    public Integer getAaf401() {
        return aaf401;
    }

    public void setAaf401(Integer aaf401) {
        this.aaf401 = aaf401;
    }

    public String getAaf402() {
        return aaf402;
    }

    public void setAaf402(String aaf402) {
        this.aaf402 = aaf402;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf401=").append(aaf401);
        sb.append(", aaf402=").append(aaf402);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}