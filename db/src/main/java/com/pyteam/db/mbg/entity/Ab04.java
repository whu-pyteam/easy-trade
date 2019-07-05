package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Ab04 implements Serializable {
    private Integer aab401;

    private Integer saab101;

    private Integer raab101;

    private String aab402;

    private Date aab403;

    private String aab404;

    private static final long serialVersionUID = 1L;

    public Integer getAab401() {
        return aab401;
    }

    public void setAab401(Integer aab401) {
        this.aab401 = aab401;
    }

    public Integer getSaab101() {
        return saab101;
    }

    public void setSaab101(Integer saab101) {
        this.saab101 = saab101;
    }

    public Integer getRaab101() {
        return raab101;
    }

    public void setRaab101(Integer raab101) {
        this.raab101 = raab101;
    }

    public String getAab402() {
        return aab402;
    }

    public void setAab402(String aab402) {
        this.aab402 = aab402;
    }

    public Date getAab403() {
        return aab403;
    }

    public void setAab403(Date aab403) {
        this.aab403 = aab403;
    }

    public String getAab404() {
        return aab404;
    }

    public void setAab404(String aab404) {
        this.aab404 = aab404;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aab401=").append(aab401);
        sb.append(", saab101=").append(saab101);
        sb.append(", raab101=").append(raab101);
        sb.append(", aab402=").append(aab402);
        sb.append(", aab403=").append(aab403);
        sb.append(", aab404=").append(aab404);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}