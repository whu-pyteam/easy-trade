package com.pyteam.db.mbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Ac05 implements Serializable {
    private Integer aac501;

    private Integer aab101;

    private String aac502;

    private Integer aac503;

    private Integer aac504;

    private Long aac505;

    private String aac506;

    private String aac507;

    private String aac508;

    private String aac509;

    private String aac510;

    private Date aac511;

    private static final long serialVersionUID = 1L;

    public Integer getAac501() {
        return aac501;
    }

    public void setAac501(Integer aac501) {
        this.aac501 = aac501;
    }

    public Integer getAab101() {
        return aab101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public String getAac502() {
        return aac502;
    }

    public void setAac502(String aac502) {
        this.aac502 = aac502;
    }

    public Integer getAac503() {
        return aac503;
    }

    public void setAac503(Integer aac503) {
        this.aac503 = aac503;
    }

    public Integer getAac504() {
        return aac504;
    }

    public void setAac504(Integer aac504) {
        this.aac504 = aac504;
    }

    public Long getAac505() {
        return aac505;
    }

    public void setAac505(Long aac505) {
        this.aac505 = aac505;
    }

    public String getAac506() {
        return aac506;
    }

    public void setAac506(String aac506) {
        this.aac506 = aac506;
    }

    public String getAac507() {
        return aac507;
    }

    public void setAac507(String aac507) {
        this.aac507 = aac507;
    }

    public String getAac508() {
        return aac508;
    }

    public void setAac508(String aac508) {
        this.aac508 = aac508;
    }

    public String getAac509() {
        return aac509;
    }

    public void setAac509(String aac509) {
        this.aac509 = aac509;
    }

    public String getAac510() {
        return aac510;
    }

    public void setAac510(String aac510) {
        this.aac510 = aac510;
    }

    public Date getAac511() {
        return aac511;
    }

    public void setAac511(Date aac511) {
        this.aac511 = aac511;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aac501=").append(aac501);
        sb.append(", aab101=").append(aab101);
        sb.append(", aac502=").append(aac502);
        sb.append(", aac503=").append(aac503);
        sb.append(", aac504=").append(aac504);
        sb.append(", aac505=").append(aac505);
        sb.append(", aac506=").append(aac506);
        sb.append(", aac507=").append(aac507);
        sb.append(", aac508=").append(aac508);
        sb.append(", aac509=").append(aac509);
        sb.append(", aac510=").append(aac510);
        sb.append(", aac511=").append(aac511);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}