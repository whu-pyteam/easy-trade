package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ab02;
import com.pyteam.db.mbg.mapper.Ab02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户验证码
 * @author tyc
 * @date 2019/7/18 16:13
 */
@Service
public class Ab02Service
{
    @Autowired
    Ab02Mapper ab02Mapper;

    public boolean insert(String number, String code)
    {
        Ab02 ab02 = new Ab02();
        ab02.setAab202(code);
        ab02.setAab204(number);
        ab02.setAab203(new Date());
        int i = ab02Mapper.insert(ab02);
        return i ==1;
    }
}
