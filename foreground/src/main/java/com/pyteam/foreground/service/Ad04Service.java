package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.entity.Ad04Example;
import com.pyteam.db.mbg.mapper.Ad04Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ad04Service
{
    @Autowired
    private Ad04Mapper ad04Mapper;

    public String getAad401(int aab101, String aad402)
    {
        Ad04Example ad04Example = new Ad04Example();
        Ad04Example.Criteria ad04Criteria = ad04Example.createCriteria();
        ad04Criteria.andAab101EqualTo(aab101);
        ad04Criteria.andAad402EqualTo(aad402);
        List<Ad04> ad04List = ad04Mapper.selectByExample(ad04Example);
        if(ad04List.isEmpty())
        {
            Ad04 ad04 = new Ad04();
            ad04.setAab101(aab101);
            ad04.setAad402(aad402);
            if(ad04Mapper.insert(ad04) <= 0)
            {
                return null;
            }
            return  String.valueOf(ad04.getAad401());
        }
        else
        {
            return String.valueOf(ad04List.get(0).getAad401());
        }
    }
}
