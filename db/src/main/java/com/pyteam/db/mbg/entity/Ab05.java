package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Ab05 implements Serializable {
    private Integer aab501;

    private Integer aab101;

    private String aab502;

    private String aab503;

    private String aab504;

    private Date aab505;

    private String aab506;

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

    public String getAab503() {
        return aab503;
    }

    public void setAab503(String aab503) {
        this.aab503 = aab503;
    }

    public String getAab504() {
        return aab504;
    }

    public void setAab504(String aab504) {
        this.aab504 = aab504;
    }

    public Date getAab505() {
        return aab505;
    }

    public void setAab505(Date aab505) {
        this.aab505 = aab505;
    }

    public String getAab506() {
        return aab506;
    }

    public void setAab506(String aab506) {
        this.aab506 = aab506;
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
        sb.append(", aab503=").append(aab503);
        sb.append(", aab504=").append(aab504);
        sb.append(", aab505=").append(aab505);
        sb.append(", aab506=").append(aab506);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}