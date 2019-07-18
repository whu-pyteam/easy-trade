package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad05;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/13 11:07
 */
public interface Ad05Service
{
    void addad05(Ad05 ad05);

    Ad05 select(Ad05 ad05);

    Ad05 aad501(Ad05 ad05);

    List<Ad05>selectbyaab101(int id);

    int count(int aab101);

    void delete(int aad101,int aab101);

    List<Ad05>selectbyaad101(int id);

}
