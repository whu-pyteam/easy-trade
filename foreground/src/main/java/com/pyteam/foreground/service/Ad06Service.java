package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad06;
import com.pyteam.db.mbg.entity.Ad06Example;
import com.pyteam.db.mbg.mapper.Ad06Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class Ad06Service
{
    @Autowired
    private Ad06Mapper ad06Mapper;

    @Autowired
    private Ad02Service ad02Service;

    public int selectAad201ByAad601(int aad601)
    {
        Ad06 ad06 = ad06Mapper.selectByPrimaryKey(aad601);
        return ad06.getAad201();
    }

    @Transactional
    public boolean deleteById(int aad601)
    {
        Ad06 ad06 = ad06Mapper.selectByPrimaryKey(aad601);
        ad06.setAad603("6");
        if(ad06Mapper.updateByPrimaryKeySelective(ad06) <= 0)
        {
            return false;
        }
        Ad02 ad02 = ad02Service.findById(ad06.getAad201());
        if(ad06.getAad602().compareTo(ad02.getAad208()) >= 0)
        {
            List<Ad06> ad06List = this.selectByAad201(ad06.getAad201());
            BigDecimal max;
            if(ad06List.isEmpty())
            {
                max = ad02.getAad206();
            }
            else
            {
                max = ad06List.get(0).getAad602();
                for(Ad06 ad06t:ad06List)
                {
                    if (ad06t.getAad602().compareTo(max) > 0)
                    {
                        max = ad06t.getAad602();
                    }
                }
            }
            ad02Service.updateAad208ByAad201(ad06.getAad201(), max);
        }
        return true;
}

    public List<Ad06> selectByAad201(int aad201)
    {
        Ad06Example ad06Example = new Ad06Example();
        Ad06Example.Criteria criteria = ad06Example.createCriteria();
        criteria.andAad201EqualTo(aad201);
        criteria.andAad603EqualTo("1");
        return ad06Mapper.selectByExample(ad06Example);
    }

    @Transactional
    public boolean insertAd06(Ad06 ad06)
    {
        Ad02 ad02 = ad02Service.findById(ad06.getAad201());
        if(ad06.getAad602().compareTo(ad02.getAad208()) > 0)
        {
            ad02Service.updateAad208ByAad201(ad06.getAad201(), ad06.getAad602());
        }
        ad06.setAad603("1");
        ad06.setAad604(new Date());
        Ad06Example ad06Example = new Ad06Example();
        Ad06Example.Criteria criteria = ad06Example.createCriteria();
        criteria.andAad201EqualTo(ad06.getAad201());
        criteria.andAab101EqualTo(ad06.getAab101());
        criteria.andAad603EqualTo("1");
        List<Ad06> ad06List = ad06Mapper.selectByExample(ad06Example);
        if(ad06List.isEmpty())
        {
            return ad06Mapper.insert(ad06) > 0;
        }
        else
        {
            ad06.setAad601(ad06List.get(0).getAad601());
            return ad06Mapper.updateByPrimaryKeySelective(ad06) > 0;
        }
    }
}
