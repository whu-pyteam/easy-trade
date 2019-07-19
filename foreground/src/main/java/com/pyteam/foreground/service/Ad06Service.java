package com.pyteam.foreground.service;

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

    public boolean insertAd06(Ad06 ad06)
    {
        ad06.setAad603("0");
        ad06.setAad604(new Date());
        return ad06Mapper.insert(ad06) > 0;
    }
}
