package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae08 implements Serializable {
    private Integer aae801;

    private Integer aac501;

    private Integer aad201;

    private static final long serialVersionUID = 1L;

    public Integer getAae801() {
        return aae801;
    }

    public void setAae801(Integer aae801) {
        this.aae801 = aae801;
    }

    public Integer getAac501() {
        return aac501;
    }

    public void setAac501(Integer aac501) {
        this.aac501 = aac501;
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
        sb.append(", aae801=").append(aae801);
        sb.append(", aac501=").append(aac501);
        sb.append(", aad201=").append(aad201);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}