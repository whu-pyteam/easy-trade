package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Af03 implements Serializable {
    private Integer aaf301;

    private Integer aaf401;

    private Integer aaf201;

    private String aaf302;

    private static final long serialVersionUID = 1L;

    public Integer getAaf301() {
        return aaf301;
    }

    public void setAaf301(Integer aaf301) {
        this.aaf301 = aaf301;
    }

    public Integer getAaf401() {
        return aaf401;
    }

    public void setAaf401(Integer aaf401) {
        this.aaf401 = aaf401;
    }

    public Integer getAaf201() {
        return aaf201;
    }

    public void setAaf201(Integer aaf201) {
        this.aaf201 = aaf201;
    }

    public String getAaf302() {
        return aaf302;
    }

    public void setAaf302(String aaf302) {
        this.aaf302 = aaf302;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf301=").append(aaf301);
        sb.append(", aaf401=").append(aaf401);
        sb.append(", aaf201=").append(aaf201);
        sb.append(", aaf302=").append(aaf302);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}