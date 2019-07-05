package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ab06 implements Serializable {
    private Integer aab601;

    private Integer baab101;

    private Integer eaab101;

    private static final long serialVersionUID = 1L;

    public Integer getAab601() {
        return aab601;
    }

    public void setAab601(Integer aab601) {
        this.aab601 = aab601;
    }

    public Integer getBaab101() {
        return baab101;
    }

    public void setBaab101(Integer baab101) {
        this.baab101 = baab101;
    }

    public Integer getEaab101() {
        return eaab101;
    }

    public void setEaab101(Integer eaab101) {
        this.eaab101 = eaab101;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aab601=").append(aab601);
        sb.append(", baab101=").append(baab101);
        sb.append(", eaab101=").append(eaab101);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}