package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac05;

/**
 * @author wjm
 * @date2019/7/15 16:01
 */
public interface Ac05Service
{
    void add(Ac05 ac05, int aad101);
    int count(String id);
    void save(int aad101);
    int ret();
}
