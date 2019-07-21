package com.pyteam.foreground.dto;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad05;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/21 11:42
 */
public class Ad05Ad01Dto
{
    //为了显示用户名的dto层

    private Ad05 ad05;
    private Ab01 ab01;

    public Ad05 getAd05()
    {
        return ad05;
    }

    public Ab01 getAb01()
    {
        return ab01 ;
    }

    public void setAb01(Ab01 ab01)
    {
        this.ab01 = ab01;
    }

    public void setAd05(Ad05 ad05)
    {
        this.ad05 = ad05;
    }
}
