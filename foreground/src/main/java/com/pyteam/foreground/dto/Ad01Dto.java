package com.pyteam.foreground.dto;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad05;
import lombok.Data;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/16 11:35
 */
@Data
public class Ad01Dto
{

    private Ad01 ad01;
    private List<Ad05> ad05s;

    public void setAd01(Ad01 ad01)
    {
        this.ad01=ad01;
    }
    public void setAd05s(List<Ad05> ad05s)
    {
        this.ad05s=ad05s;
    }

    public Ad01 getAd01()
    {
        return ad01;
    }
    public List<Ad05> getAd05s()
    {
        return ad05s;
    }
}
