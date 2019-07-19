package com.pyteam.foreground.dto;

import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ad01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/19 15:29
 */
public class Ad01ac02Dto
{
    private Ad01 ad01;
    List<Ac02> ac02List;


    public List<Ac02> getAc02List()
    {
        return ac02List;
    }

    public void setAc02List(List<Ac02> ac02List)
    {
        this.ac02List = ac02List;
    }

    public Ad01 getAd01()
    {
        return ad01;
    }

    public void setAd01(Ad01 ad01)
    {
        this.ad01 = ad01;
    }
}
