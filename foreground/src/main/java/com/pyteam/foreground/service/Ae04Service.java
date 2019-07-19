package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 10:10
 */
public interface Ae04Service
{
    void addad04(Ad04 ad04, Ad01 ad01);
    void deleteaddad04(Ad01 ad01);
    List<Ad01> showthem(Ad01 ad01);
}
