package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad06;
import com.pyteam.db.mbg.mapper.Ad06Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Ad06Service
{
    @Autowired
    private Ad06Mapper ad06Mapper;

    @Autowired
    private Ad02Service ad02Service;

    public boolean insertAd06(Ad06 ad06)
    {
        Ad02 ad02 = ad02Service.findById(ad06.getAad201());
        if(ad06.getAad602().compareTo(ad02.getAad208()) > 0)
        {
            ad02Service.updateAad208ByAad201(ad06.getAad201(), ad06.getAad602());
        }
        ad06.setAad603("0");
        ad06.setAad604(new Date());
        return ad06Mapper.insert(ad06) > 0;
    }
}
