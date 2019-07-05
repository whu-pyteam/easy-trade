package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Af01 implements Serializable {
    private Integer aaf101;

    private Integer aab101;

    private String aaf102;

    private static final long serialVersionUID = 1L;

    public Integer getAaf101() {
        return aaf101;
    }

    public void setAaf101(Integer aaf101) {
        this.aaf101 = aaf101;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAaf102() {
        return aaf102;
    }

    public void setAaf102(String aaf102) {
        this.aaf102 = aaf102;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf101=").append(aaf101);
        sb.append(", aab101=").append(aab101);
        sb.append(", aaf102=").append(aaf102);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}