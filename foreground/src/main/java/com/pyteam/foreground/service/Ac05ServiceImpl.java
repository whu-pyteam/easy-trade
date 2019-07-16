package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.foreground.mapper.Ac05NewMapper;
import com.pyteam.foreground.mapper.Ae09NewMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author wjm
 * @date2019/7/15 16:02
 */
@Repository
@Service
public class Ac05ServiceImpl implements Ac05Service
{
    @Autowired
    private Ac05NewMapper ac05NewMapper;

    @Override
    public void add(Ac05 ac05)
    {
        ac05NewMapper.insertAc05(ac05);
    }

    @Override
    public int count(String id)
    {
        return ac05NewMapper.count(id);
    }
}
