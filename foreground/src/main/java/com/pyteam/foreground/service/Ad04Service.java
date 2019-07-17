package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 9:09
 */
public interface Ad04Service
{
    void add(Ad01 ad01);
    void delete(int id);
    List<Ad04> query(int id);
}
