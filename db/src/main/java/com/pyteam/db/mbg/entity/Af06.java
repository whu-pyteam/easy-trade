package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Af06 implements Serializable {
    private Integer aaf601;

    private String aaf602;

    private Integer aaf603;

    private static final long serialVersionUID = 1L;

    public Integer getAaf601() {
        return aaf601;
    }

    public void setAaf601(Integer aaf601) {
        this.aaf601 = aaf601;
    }

    public String getAaf602() {
        return aaf602;
    }

    public void setAaf602(String aaf602) {
        this.aaf602 = aaf602;
    }

    public Integer getAaf603() {
        return aaf603;
    }

    public void setAaf603(Integer aaf603) {
        this.aaf603 = aaf603;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaf601=").append(aaf601);
        sb.append(", aaf602=").append(aaf602);
        sb.append(", aaf603=").append(aaf603);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}