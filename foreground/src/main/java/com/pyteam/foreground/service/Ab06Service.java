package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ab06;
import com.pyteam.db.mbg.entity.Ab06Example;
import com.pyteam.db.mbg.mapper.Ab06Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ab06Service
{
    @Autowired
    private Ab06Mapper ab06Mapper;

    public boolean addFollower(Integer follower,Integer master)
    {
        Ab06 ab06=new Ab06();
        ab06.setBaab101(follower);
        ab06.setEaab101(master);
        int res=ab06Mapper.insert(ab06);
        return res>0;
    }

    public boolean hasFollowed(Integer follower,Integer master)
    {
        Ab06Example ab06Example=new Ab06Example();
        Ab06Example.Criteria criteria=ab06Example.createCriteria();
        criteria.andBaab101EqualTo(follower);
        criteria.andEaab101EqualTo(master);
        if(ab06Mapper.selectByExample(ab06Example).size()!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
