package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ae09;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/15 15:34
 */
public interface Ae09Service
{
    int addAe09(Ae09 ae09,Ac02 ac02);

    void update(Ae09 ae09);

    int delete(int aad101,String aac202);
    List<Ac02> query(int aad101);

    List<Ad01> sel(String aac202);
}
