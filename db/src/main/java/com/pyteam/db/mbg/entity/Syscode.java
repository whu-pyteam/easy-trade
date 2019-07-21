package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Syscode implements Serializable {
    private Integer syscodeid;

    private String idname;

    private String parentid;

    private static final long serialVersionUID = 1L;

    public Integer getSyscodeid() {
        return syscodeid;
    }

    public void setSyscodeid(Integer syscodeid) {
        this.syscodeid = syscodeid;
    }

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", syscodeid=").append(syscodeid);
        sb.append(", idname=").append(idname);
        sb.append(", parentid=").append(parentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}