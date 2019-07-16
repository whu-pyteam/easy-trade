package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ae09;
import com.pyteam.foreground.mapper.Ae09NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wjm
 * @date2019/7/15 15:37
 */
@Service
public class Ae09ServiceImpl implements Ae09Service
{
    @Autowired
    private Ae09NewMapper ae09NewMapper;

    @Override
    public void addAe09(Ae09 ae09)
    {
        ae09NewMapper.insert(ae09);
    }

    @Override
    public void delete(Ae09 ae09)
    {
        ae09NewMapper.update(ae09);
    }
}
