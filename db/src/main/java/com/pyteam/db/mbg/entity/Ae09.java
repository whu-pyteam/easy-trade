package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae09 implements Serializable {
    private Integer aae901;

    private Integer aad101;

    private Integer aac201;

    private static final long serialVersionUID = 1L;

    public Integer getAae901() {
        return aae901;
    }

    public void setAae901(Integer aae901) {
        this.aae901 = aae901;
    }

    public Integer getAad101() {
        return aad101;
    }

    public void setAad101(Integer aad101) {
        this.aad101 = aad101;
    }

    public Integer getAac201() {
        return aac201;
    }

    public void setAac201(Integer aac201) {
        this.aac201 = aac201;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aae901=").append(aae901);
        sb.append(", aad101=").append(aad101);
        sb.append(", aac201=").append(aac201);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}