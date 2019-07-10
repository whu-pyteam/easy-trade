package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Af02 implements Serializable {
    private Integer aaf201;

    private String aaf202;

    private String aaf203;

    private String aaf204;

    private Date aaf205;

    private Date aaf206;

    private Integer aaf207;

    private String aaf208;

    private static final long serialVersionUID = 1L;

    public Integer getAaf201() {
        return aaf201;
    }

    public void setAaf201(Integer aaf201) {
        this.aaf201 = aaf201;
    }

    public String getAaf202() {
        return aaf202;
    }

    public void setAaf202(String aaf202) {
        this.aaf202 = aaf202;
    }

    public String getAaf203() {
        return aaf203;
    }

    public void setAaf203(String aaf203) {
        this.aaf203 = aaf203;
    }

    public String getAaf204() {
        return aaf204;
    }

    public void setAaf204(String aaf204) {
        this.aaf204 = aaf204;
    }

    public Date getAaf205() {
        return aaf205;
    }

    public void setAaf205(Date aaf205) {
        this.aaf205 = aaf205;
    }

    public Date getAaf206() {
        return aaf206;
    }

    public void setAaf206(Date aaf206) {
        this.aaf206 = aaf206;
    }

    public Integer getAaf207() {
        return aaf207;
    }

    public void setAaf207(Integer aaf207) {
        this.aaf207 = aaf207;
    }

    public String getAaf208() {
        return aaf208;
    }

    public void setAaf208(String aaf208) {
        this.aaf208 = aaf208;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf201=").append(aaf201);
        sb.append(", aaf202=").append(aaf202);
        sb.append(", aaf203=").append(aaf203);
        sb.append(", aaf204=").append(aaf204);
        sb.append(", aaf205=").append(aaf205);
        sb.append(", aaf206=").append(aaf206);
        sb.append(", aaf207=").append(aaf207);
        sb.append(", aaf208=").append(aaf208);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}