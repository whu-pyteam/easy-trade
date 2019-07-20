package com.pyteam.foreground.dto;

import com.pyteam.db.mbg.entity.Ae02;

/**
 * @author wjm
 * @date2019/7/20 11:13
 */
public class Ae02Dto
{
    private Ae02 ae02;
    private String aac502;

    public Ae02 getAe02()
    {
        return ae02;
    }

    public String getAac502()
    {
        return aac502;
    }

    public void setAac502(String aac502)
    {
        this.aac502 = aac502;
    }

    public void setAe02(Ae02 ae02)
    {
        this.ae02 = ae02;
    }
}
