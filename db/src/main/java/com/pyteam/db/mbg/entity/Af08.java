package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Af08 implements Serializable {
    private Integer aaf801;

    private Integer aaf601;

    private Integer aaf901;

    private static final long serialVersionUID = 1L;

    public Integer getAaf801() {
        return aaf801;
    }

    public void setAaf801(Integer aaf801) {
        this.aaf801 = aaf801;
    }

    public Integer getAaf601() {
        return aaf601;
    }

    public void setAaf601(Integer aaf601) {
        this.aaf601 = aaf601;
    }

    public Integer getAaf901() {
        return aaf901;
    }

    public void setAaf901(Integer aaf901) {
        this.aaf901 = aaf901;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf801=").append(aaf801);
        sb.append(", aaf601=").append(aaf601);
        sb.append(", aaf901=").append(aaf901);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}