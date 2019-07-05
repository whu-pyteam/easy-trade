package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Ae06 implements Serializable {
    private Integer aae601;

    private Integer aac501;

    private Integer aac101;

    private static final long serialVersionUID = 1L;

    public Integer getAae601() {
        return aae601;
    }

    public void setAae601(Integer aae601) {
        this.aae601 = aae601;
    }

    public Integer getAac501() {
        return aac501;
    }

    public void setAac501(Integer aac501) {
        this.aac501 = aac501;
    }

    public Integer getAac101() {
        return aac101;
    }

    public void setAac101(Integer aac101) {
        this.aac101 = aac101;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aae601=").append(aae601);
        sb.append(", aac501=").append(aac501);
        sb.append(", aac101=").append(aac101);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}