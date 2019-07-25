package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ab05;
import com.pyteam.db.mbg.mapper.Ab05Mapper;
import com.pyteam.foreground.dto.Ab05Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Ab05Service
{
    @Autowired
    private Ab05Mapper ab05Mapper;

    public boolean addReflect(Ab05Dto ab05Dto)
    {
        Ab05 ab05=new Ab05();
        ab05.setAab101(ab05Dto.getAab101());
        ab05.setAab502(ab05Dto.getAab502());
        ab05.setAab503(ab05Dto.getAab503());
        ab05.setAab504("0");
        ab05.setAab505(new Date());
        int res = ab05Mapper.insert(ab05);
        return res>0;
    }
}
