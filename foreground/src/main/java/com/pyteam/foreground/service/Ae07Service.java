package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ae07;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/16 8:59
 */
public interface Ae07Service
{
     void add(Ae07 ae07);
     List<Ac05> select(int id);

     void update(Ac05 ac05);
     void delete(Ac05 ac05);
}
