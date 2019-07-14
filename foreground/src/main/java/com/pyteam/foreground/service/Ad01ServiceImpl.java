package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad01Example;
import com.pyteam.db.mbg.mapper.Ad01Mapper;
import com.pyteam.foreground.mapper.Ad01NewMapper;
import io.swagger.annotations.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/9 13:23
 */
@Service
public class Ad01ServiceImpl implements Ad01Service
{
    @Autowired
    private Ad01Mapper ad01Mapper;
    @Autowired
    private Ad01NewMapper ad01NewMapper;
    @Override
    public void add(Ad01 ad01)
    {
        ad01NewMapper.addad01(ad01);
    }

    //不定条件查询
    @Override
    public List<Ad01> notSure(String question)
    {
        return ad01NewMapper.notSure(question,question);
    }
    //根据订单号查询
    @Override
    public List<Ad01> selectById(int id)
    {
        return ad01NewMapper.findByPrimaryKey(id);
    }

    @Override
    public List<Ad01> listByAll()
    {
        return ad01NewMapper.listByAll();
    }

    @Override
    public void deleteById(int id)
    {
        ad01Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void edit(Ad01 ad01)
    {
        ad01NewMapper.updatenn(ad01);
    }

    @Override
    public List<Ad01> moreQuery(String question)
    {
        return  ad01NewMapper.moreQuery(question);
    }

    @Override
    public List<Ad01> findById(int id)
    {
        return ad01NewMapper.findById(id);
    }

    @Override
    public Ad01 findbyaad101(int aad101)
    {
        return ad01Mapper.selectByPrimaryKey(aad101);
    }

    @Override
    public void editcount(Ad01 ad01)
    {
        ad01NewMapper.updateaad106(ad01);
    }
}
