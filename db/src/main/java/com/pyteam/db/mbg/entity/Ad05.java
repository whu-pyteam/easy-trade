package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ad05 implements Serializable {
    private Integer aad501;

    private Integer aad101;

    private Integer aab101;

    private static final long serialVersionUID = 1L;

    public Integer getAad501() {
        return aad501;
    }

    public void setAad501(Integer aad501) {
        this.aad501 = aad501;
    }

    public Integer getAad101() {
        return aad101;
    }

    public void setAad101(Integer aad101) {
        this.aad101 = aad101;
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
        sb.append(", aad501=").append(aad501);
        sb.append(", aad101=").append(aad101);
        sb.append(", aab101=").append(aab101);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}