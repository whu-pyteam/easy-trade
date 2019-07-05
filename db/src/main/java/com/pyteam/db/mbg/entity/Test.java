package com.pyteam.db.mbg.entity;

import java.io.Serializable;

public class Test implements Serializable {
    private Integer aab01;

    private String name;

    private Integer age;

    private static final long serialVersionUID = 1L;

    public Integer getAab01() {
        return aab01;
    }

    public void setAab01(Integer aab01) {
        this.aab01 = aab01;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aab01=").append(aab01);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}