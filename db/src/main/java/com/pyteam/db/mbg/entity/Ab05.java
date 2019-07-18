package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ab05 implements Serializable {
    private Integer aab501;

    private Integer aab101;

    private String aab502;

    private static final long serialVersionUID = 1L;

    public Integer getAab501() {
        return aab501;
    }

    public void setAab501(Integer aab501) {
        this.aab501 = aab501;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAab502() {
        return aab502;
    }

    public void setAab502(String aab502) {
        this.aab502 = aab502;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aab501=").append(aab501);
        sb.append(", aab101=").append(aab101);
        sb.append(", aab502=").append(aab502);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}