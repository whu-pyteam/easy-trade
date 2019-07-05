package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Ac01 implements Serializable {
    private Integer aac101;

    private Integer aab101;

    private Integer aac201;

    private String aac102;

    private String aac103;

    private String aac104;

    private Long aac105;

    private String aac106;

    private Date aac107;

    private static final long serialVersionUID = 1L;

    public Integer getAac101() {
        return aac101;
    }

    public void setAac101(Integer aac101) {
        this.aac101 = aac101;
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

    public String getAac102() {
        return aac102;
    }

    public void setAac102(String aac102) {
        this.aac102 = aac102;
    }

    public String getAac103() {
        return aac103;
    }

    public void setAac103(String aac103) {
        this.aac103 = aac103;
    }

    public String getAac104() {
        return aac104;
    }

    public void setAac104(String aac104) {
        this.aac104 = aac104;
    }

    public Long getAac105() {
        return aac105;
    }

    public void setAac105(Long aac105) {
        this.aac105 = aac105;
    }

    public String getAac106() {
        return aac106;
    }

    public void setAac106(String aac106) {
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
        sb.append(", aac101=").append(aac101);
        sb.append(", aab101=").append(aab101);
        sb.append(", aac201=").append(aac201);
        sb.append(", aac102=").append(aac102);
        sb.append(", aac103=").append(aac103);
        sb.append(", aac104=").append(aac104);
        sb.append(", aac105=").append(aac105);
        sb.append(", aac106=").append(aac106);
        sb.append(", aac107=").append(aac107);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}