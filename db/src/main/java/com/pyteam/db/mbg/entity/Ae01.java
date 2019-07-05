package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae01 implements Serializable {
    private Integer aae101;

    private Integer aad301;

    private Integer aac101;

    private static final long serialVersionUID = 1L;

    public Integer getAae101() {
        return aae101;
    }

    public void setAae101(Integer aae101) {
        this.aae101 = aae101;
    }

    public Integer getAad301() {
        return aad301;
    }

    public void setAad301(Integer aad301) {
        this.aad301 = aad301;
    }

    public Integer getAac101() {
        return aac101;
    }

    public void setAac101(Integer aac101) {
        this.aac101 = aac101;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aae101=").append(aae101);
        sb.append(", aad301=").append(aad301);
        sb.append(", aac101=").append(aac101);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}