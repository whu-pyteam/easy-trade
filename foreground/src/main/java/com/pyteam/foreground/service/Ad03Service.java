package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.*;
import com.pyteam.db.mbg.mapper.Ad03Mapper;
import com.pyteam.db.mbg.mapper.Ae01Mapper;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class Ad03Service
{
    @Autowired
    private Ad03Mapper ad03Mapper;
    @Autowired
    private Ae01Mapper ae01Mapper;

    @Transactional(rollbackFor = Exception.class)
    public boolean submitComment(String aad303,String aad304,Integer aab101,Integer aac101)
    {
        try
        {
            Ad03 ad03 = new Ad03();
            ad03.setAad303(aad303);
            ad03.setAad304(aad304);
            ad03.setAab101(aab101);
            ad03.setAad302("1");
            ad03Mapper.insert(ad03);
            Integer aad301 = ad03.getAad301();

            Ae01 ae01 = new Ae01();
            ae01.setAac101(aac101);
            ae01.setAad301(aad301);
            ae01Mapper.insert(ae01);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public List<Ad03> hasCommend(Integer aac101)
    {
        Ae01Example ae01Example=new Ae01Example();
        Ae01Example.Criteria criteria=ae01Example.createCriteria();
        criteria.andAac101EqualTo(aac101);
        List<Ae01> ae01List = ae01Mapper.selectByExample(ae01Example);

        List<Ad03> ids=new ArrayList<>();
        if(ae01List.size()!=0)
        {
            if(ae01List.size()==1)
            {
                Ad03 ad03 = ad03Mapper.selectByPrimaryKey(ae01List.get(0).getAad301());
                ids.add(ad03);
                return ids;
            }
            if(ae01List.size()==2)
            {
                Ad03 ad031 = ad03Mapper.selectByPrimaryKey(ae01List.get(0).getAad301());
                Ad03 ad032 = ad03Mapper.selectByPrimaryKey(ae01List.get(1).getAad301());
                ids.add(ad031);
                ids.add(ad032);
                return ids;
            }
        }
        return ids;
    }
}
