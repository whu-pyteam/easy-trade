package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad05;
import com.pyteam.foreground.mapper.Ad05NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/13 11:11
 */
@Service
@Repository
public class Ad05ServicesImpl implements Ad05Service
{
    @Autowired
    private Ad05NewMapper ad05NewMapper;
//    @Autowired
//    private Ad01NewMapper ad01NewMapper;

    @Override
    public void addad05(Ad05 ad05)
    {
        ad05NewMapper.addad05(ad05);
    }

    @Override
    public Ad05 select(Ad05 ad05)
    {
        return ad05NewMapper.select(ad05);
    }

    // 查aad501字段,用于判断是否添加

    @Override
    public Ad05 aad501(Ad05 ad05)
    {
         return ad05NewMapper.aad501(ad05);
    }

    @Override
    public List<Ad05> selectbyaab101(int id)
    {
        return ad05NewMapper.slect(id);
    }

    @Override
    public int count (int aab101)
    {
        return ad05NewMapper.count(aab101);
    }

    @Override
    public void delete(int aad101,int aab101)
    {
        ad05NewMapper.delete(aad101,aab101);
    }

    @Override
    public List<Ad05> selectbyaad101(int id)
    {
        return ad05NewMapper.selectbyaad101(id);
    }

}
