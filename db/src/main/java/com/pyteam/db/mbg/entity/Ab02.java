package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Ab02 implements Serializable {
    private Integer aab201;

    private String aab204;

    private String aab202;

    private Date aab203;

    private static final long serialVersionUID = 1L;

    public Integer getAab201() {
        return aab201;
    }

    public void setAab201(Integer aab201) {
        this.aab201 = aab201;
    }

    public String getAab204() {
        return aab204;
    }

    public void setAab204(String aab204) {
        this.aab204 = aab204;
    }

    public String getAab202() {
        return aab202;
    }

    public void setAab202(String aab202) {
        this.aab202 = aab202;
    }

    public Date getAab203() {
        return aab203;
    }

    public void setAab203(Date aab203) {
        this.aab203 = aab203;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aab201=").append(aab201);
        sb.append(", aab204=").append(aab204);
        sb.append(", aab202=").append(aab202);
        sb.append(", aab203=").append(aab203);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}