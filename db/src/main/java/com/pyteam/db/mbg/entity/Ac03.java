package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ac03 implements Serializable {
    private Integer aac301;

    private Integer aab101;

    private static final long serialVersionUID = 1L;

    public Integer getAac301() {
        return aac301;
    }

    public void setAac301(Integer aac301) {
        this.aac301 = aac301;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aac301=").append(aac301);
        sb.append(", aab101=").append(aab101);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}