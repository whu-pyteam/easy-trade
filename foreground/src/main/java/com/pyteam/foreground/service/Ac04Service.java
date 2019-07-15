package com.pyteam.foreground.service;

import com.pyteam.db.mbg.mapper.Ac04Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ac04Service
{
    @Autowired
    private Ac04Mapper ac04Mapper;
}
