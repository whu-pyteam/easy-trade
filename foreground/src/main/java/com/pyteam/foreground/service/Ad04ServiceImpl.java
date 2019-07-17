package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.mapper.Ad04Mapper;
import com.pyteam.foreground.mapper.Ad01NewMapper;
import com.pyteam.foreground.mapper.Ad04NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 9:12
 */
@Service
public class Ad04ServiceImpl implements Ad04Service
{
    @Autowired
    private Ad04Mapper ad04Mapper;
    @Autowired
    private Ad04NewMapper ad04NewMapper;

    @Override
    public void add(Ad01 ad01)
    {
        ad04NewMapper.addad01(ad01);
    }

    @Override
    public void delete(int id)
    {

    }
    @Override
    public List<Ad04> query(int id)
    {
        return ad04NewMapper.findById(id);
    }
}
