package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Af07 implements Serializable {
    private Integer aaf701;

    private Integer aaf601;

    private Integer aaf201;

    private static final long serialVersionUID = 1L;

    public Integer getAaf701() {
        return aaf701;
    }

    public void setAaf701(Integer aaf701) {
        this.aaf701 = aaf701;
    }

    public Integer getAaf601() {
        return aaf601;
    }

    public void setAaf601(Integer aaf601) {
        this.aaf601 = aaf601;
    }

    public Integer getAaf201() {
        return aaf201;
    }

    public void setAaf201(Integer aaf201) {
        this.aaf201 = aaf201;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf701=").append(aaf701);
        sb.append(", aaf601=").append(aaf601);
        sb.append(", aaf201=").append(aaf201);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}