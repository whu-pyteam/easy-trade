package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Ad01 implements Serializable {
    private Integer aad101;

    private Integer aab101;

    private String aad102;

    private String aad103;

    private Long aad104;

    private Integer aac105;

    private Date aac106;

    private Date aac107;

    private static final long serialVersionUID = 1L;

    public Integer getAad101() {
        return aad101;
    }

    public void setAad101(Integer aad101) {
        this.aad101 = aad101;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAad102() {
        return aad102;
    }

    public void setAad102(String aad102) {
        this.aad102 = aad102;
    }

    public String getAad103() {
        return aad103;
    }

    public void setAad103(String aad103) {
        this.aad103 = aad103;
    }

    public Long getAad104() {
        return aad104;
    }

    public void setAad104(Long aad104) {
        this.aad104 = aad104;
    }

    public Integer getAac105() {
        return aac105;
    }

    public void setAac105(Integer aac105) {
        this.aac105 = aac105;
    }

    public Date getAac106() {
        return aac106;
    }

    public void setAac106(Date aac106) {
        this.aac106 = aac106;
    }

    public Date getAac107() {
        return aac107;
    }

    public void setAac107(Date aac107) {
        this.aac107 = aac107;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aad101=").append(aad101);
        sb.append(", aab101=").append(aab101);
        sb.append(", aad102=").append(aad102);
        sb.append(", aad103=").append(aad103);
        sb.append(", aad104=").append(aad104);
        sb.append(", aac105=").append(aac105);
        sb.append(", aac106=").append(aac106);
        sb.append(", aac107=").append(aac107);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}