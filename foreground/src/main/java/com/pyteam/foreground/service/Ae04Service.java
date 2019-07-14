package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ae04;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 10:10
 */
public interface Ae04Service
{
    void add(Ae04 ae04);
    List<Ae04> query(int id);
    int count(int id);
    void delete (Ae04 ae04);
    Ae04 select (Ae04 ae04);
}
