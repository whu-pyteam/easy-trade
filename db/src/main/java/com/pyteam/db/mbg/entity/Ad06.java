package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Ad06 implements Serializable {
    private Integer aad601;

    private Integer aad201;

    private Integer aab101;

    private BigDecimal aad602;

    private String aad603;

    private Date aad604;

    private static final long serialVersionUID = 1L;

    public Integer getAad601() {
        return aad601;
    }

    public void setAad601(Integer aad601) {
        this.aad601 = aad601;
    }

    public Integer getAad201() {
        return aad201;
    }

    public void setAad201(Integer aad201) {
        this.aad201 = aad201;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public BigDecimal getAad602() {
        return aad602;
    }

    public void setAad602(BigDecimal aad602) {
        this.aad602 = aad602;
    }

    public String getAad603() {
        return aad603;
    }

    public void setAad603(String aad603) {
        this.aad603 = aad603;
    }

    public Date getAad604() {
        return aad604;
    }

    public void setAad604(Date aad604) {
        this.aad604 = aad604;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aad601=").append(aad601);
        sb.append(", aad201=").append(aad201);
        sb.append(", aab101=").append(aab101);
        sb.append(", aad602=").append(aad602);
        sb.append(", aad603=").append(aad603);
        sb.append(", aad604=").append(aad604);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}