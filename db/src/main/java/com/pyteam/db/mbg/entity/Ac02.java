package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ac02 implements Serializable {
    private Integer aac201;

    private String aac202;

    private Integer aac203;

    private static final long serialVersionUID = 1L;

    public Integer getAac201() {
        return aac201;
    }

    public void setAac201(Integer aac201) {
        this.aac201 = aac201;
    }

    public String getAac202() {
        return aac202;
    }

    public void setAac202(String aac202) {
        this.aac202 = aac202;
    }

    public Integer getAac203() {
        return aac203;
    }

    public void setAac203(Integer aac203) {
        this.aac203 = aac203;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aac201=").append(aac201);
        sb.append(", aac202=").append(aac202);
        sb.append(", aac203=").append(aac203);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}