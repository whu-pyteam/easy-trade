package com.pyteam.background.service.impl;

import com.pyteam.background.service.Af06Service;
import com.pyteam.db.mbg.entity.Af06;
import com.pyteam.db.mbg.entity.Af06Example;
import com.pyteam.db.mbg.mapper.Af06Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/11 9:28
 */
@Service
public class Af06ServiceImpl implements Af06Service
{
    @Autowired
    Af06Mapper af06Mapper;

    @Override
    public List<Af06> getRoleList()
    {
        Af06Example af06Example = new Af06Example();
        Af06Example.Criteria criteria = af06Example.createCriteria();
        criteria.andAaf603EqualTo(1);
        return af06Mapper.selectByExample(af06Example);
    }
}
