package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae07 implements Serializable {
    private Integer aae701;

    private Integer aad101;

    private Integer aac501;

    private static final long serialVersionUID = 1L;

    public Integer getAae701() {
        return aae701;
    }

    public void setAae701(Integer aae701) {
        this.aae701 = aae701;
    }

    public Integer getAad101() {
        return aad101;
    }

    public void setAad101(Integer aad101) {
        this.aad101 = aad101;
    }

    public Integer getAac501() {
        return aac501;
    }

    public void setAac501(Integer aac501) {
        this.aac501 = aac501;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aae701=").append(aae701);
        sb.append(", aad101=").append(aad101);
        sb.append(", aac501=").append(aac501);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}