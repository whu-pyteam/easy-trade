package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.entity.Ad05;
import com.pyteam.foreground.dto.Ad05Ad01Dto;
import com.pyteam.foreground.mapper.Ab01NewMapper;
import com.pyteam.foreground.mapper.Ad05NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/13 11:07
 */
@Service
@Repository
public class Ad05Service
{
    @Autowired
    private Ad05NewMapper ad05NewMapper;

    @Autowired
    private Ab01NewMapper ab01NewMapper;


    public void addad05(Ad05 ad05)
    {
        ad05NewMapper.addad05(ad05);
    }


    public Ad05 select(Ad05 ad05)
    {
        return ad05NewMapper.select(ad05);
    }

    // 查aad501字段,用于判断是否添加


    public Ad05 aad501(Ad05 ad05)
    {
        return ad05NewMapper.aad501(ad05);
    }


    public List<Ad05> selectbyaab101(int id)
    {
        return ad05NewMapper.slect(id);
    }


    public int count (int aab101)
    {
        return ad05NewMapper.count(aab101);
    }


    public void delete(int aad101,int aab101)
    {
        ad05NewMapper.delete(aad101,aab101);
    }


    public List<Ad05Ad01Dto> selectbyaad101(int id)
    {
        List<Ad05Ad01Dto> ad05Ad01DtoList=new ArrayList<>();
        int count =ad05NewMapper.countaad101(id);
        List<Ad05> ad05list= ad05NewMapper.selectbyaad101(id);
        if(ad05list!=null)
        {
            for(int i=0;i<count;i++)
            {
                int aab101=ad05list.get(i).getAab101();
                Ab01 ab01=ab01NewMapper.selectad01(aab101);
                Ad05Ad01Dto ad05Ad01Dto=new Ad05Ad01Dto();
                ad05Ad01Dto.setAd05(ad05list.get(i));
                ad05Ad01Dto.setAb01(ab01);
                ad05Ad01DtoList.add(i,ad05Ad01Dto);
            }
        }
        return ad05Ad01DtoList;
    }

}
