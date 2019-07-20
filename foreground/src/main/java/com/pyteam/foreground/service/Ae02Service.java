package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac03;
import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ad03;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/20 8:39
 */
public interface Ae02Service
{
    List<Ac05>queryByAab101(int aab101);

    void updateaccpet(String aac502);

    void updatecc(String aac502);

    int aab101(String aac502);

    void insert(Ad03 ad03s,String aac502);

    List<Ad03> qe(int aab101);

    void update(Ad03 ad03);

    void del(int aad301);
}
