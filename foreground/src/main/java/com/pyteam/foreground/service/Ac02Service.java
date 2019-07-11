package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.mapper.Ac02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 分类标签表ac02
 */
@Service
public class Ac02Service
{
    @Autowired
    private Ac02Mapper ac02Mapper;

    public boolean addAc02() throws Exception
    {
        Ac02 ac02 = new Ac02();
        ac02.setAac202("手机");
        ac02.setAac203(0);
        return ac02Mapper.insert(ac02) > 0;
    }
}
