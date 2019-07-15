package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Ad02 implements Serializable {
    private Integer aad201;

    private Integer aab101;

    private Integer aac201;

    private String aad202;

    private String aad203;

    private String aad204;

    private String aad205;

    private BigDecimal aad206;

    private BigDecimal aad207;

    private BigDecimal aad208;

    private String aad209;

    private Date aad210;

    private Date aad211;

    private Date aad212;

    private static final long serialVersionUID = 1L;

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

    public Integer getAac201() {
        return aac201;
    }

    public void setAac201(Integer aac201) {
        this.aac201 = aac201;
    }

    public String getAad202() {
        return aad202;
    }

    public void setAad202(String aad202) {
        this.aad202 = aad202;
    }

    public String getAad203() {
        return aad203;
    }

    public void setAad203(String aad203) {
        this.aad203 = aad203;
    }

    public String getAad204() {
        return aad204;
    }

    public void setAad204(String aad204) {
        this.aad204 = aad204;
    }

    public String getAad205() {
        return aad205;
    }

    public void setAad205(String aad205) {
        this.aad205 = aad205;
    }

    public BigDecimal getAad206() {
        return aad206;
    }

    public void setAad206(BigDecimal aad206) {
        this.aad206 = aad206;
    }

    public BigDecimal getAad207() {
        return aad207;
    }

    public void setAad207(BigDecimal aad207) {
        this.aad207 = aad207;
    }

    public BigDecimal getAad208() {
        return aad208;
    }

    public void setAad208(BigDecimal aad208) {
        this.aad208 = aad208;
    }

    public String getAad209() {
        return aad209;
    }

    public void setAad209(String aad209) {
        this.aad209 = aad209;
    }

    public Date getAad210() {
        return aad210;
    }

    public void setAad210(Date aad210) {
        this.aad210 = aad210;
    }

    public Date getAad211() {
        return aad211;
    }

    public void setAad211(Date aad211) {
        this.aad211 = aad211;
    }

    public Date getAad212() {
        return aad212;
    }

    public void setAad212(Date aad212) {
        this.aad212 = aad212;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aad201=").append(aad201);
        sb.append(", aab101=").append(aab101);
        sb.append(", aac201=").append(aac201);
        sb.append(", aad202=").append(aad202);
        sb.append(", aad203=").append(aad203);
        sb.append(", aad204=").append(aad204);
        sb.append(", aad205=").append(aad205);
        sb.append(", aad206=").append(aad206);
        sb.append(", aad207=").append(aad207);
        sb.append(", aad208=").append(aad208);
        sb.append(", aad209=").append(aad209);
        sb.append(", aad210=").append(aad210);
        sb.append(", aad211=").append(aad211);
        sb.append(", aad212=").append(aad212);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}