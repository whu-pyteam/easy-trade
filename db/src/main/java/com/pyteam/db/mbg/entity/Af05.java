package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Af05 implements Serializable {
    private Integer aaf501;

    private Integer aab101;

    private String aaf502;

    private Date aaf503;

    private static final long serialVersionUID = 1L;

    public Integer getAaf501() {
        return aaf501;
    }

    public void setAaf501(Integer aaf501) {
        this.aaf501 = aaf501;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAaf502() {
        return aaf502;
    }

    public void setAaf502(String aaf502) {
        this.aaf502 = aaf502;
    }

    public Date getAaf503() {
        return aaf503;
    }

    public void setAaf503(Date aaf503) {
        this.aaf503 = aaf503;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf501=").append(aaf501);
        sb.append(", aab101=").append(aab101);
        sb.append(", aaf502=").append(aaf502);
        sb.append(", aaf503=").append(aaf503);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}