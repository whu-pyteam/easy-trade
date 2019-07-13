package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Ad01 implements Serializable {
    private Integer aad101;

    private Integer aab101;

    private String aad102;

    private String aad103;

    private Long aad104;

    private Integer aad106;

    private Date aad107;

    private Date aad108;

    private String aad105;

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

    public Integer getAad106() {
        return aad106;
    }

    public void setAad106(Integer aad106) {
        this.aad106 = aad106;
    }

    public Date getAad107() {
        return aad107;
    }

    public void setAad107(Date aad107) {
        this.aad107 = aad107;
    }

    public Date getAad108() {
        return aad108;
    }

    public void setAad108(Date aad108) {
        this.aad108 = aad108;
    }

    public String getAad105() {
        return aad105;
    }

    public void setAad105(String aad105) {
        this.aad105 = aad105;
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
        sb.append(", aad106=").append(aad106);
        sb.append(", aad107=").append(aad107);
        sb.append(", aad108=").append(aad108);
        sb.append(", aad105=").append(aad105);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}