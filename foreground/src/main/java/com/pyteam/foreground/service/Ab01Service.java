package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.mapper.Ab01Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用户表ab01
 */
@Service
public class Ab01Service
{
    @Autowired
    private Ab01Mapper ab01Mapper;

    public boolean addAb01() throws Exception
    {
        Ab01 ab01 = new Ab01();
        ab01.setAab102("会员001");
        ab01.setAab103("小明");
        ab01.setAab104("1");  //0-未知，1-男，2-女
        ab01.setAab105(new SimpleDateFormat("yyyy-MM-dd").parse("1998-08-30"));
        ab01.setAab106(new Integer(1234));
        ab01.setAab107("url");
        ab01.setAab108("123456");
        ab01.setAab109(new Integer(0));
        ab01.setAab110("0");
        ab01.setAab111("");
        ab01.setAab112("158xxxx");
        ab01.setAab113(new Date());
        ab01.setAab114(new Date());
        Integer res = ab01Mapper.insert(ab01);
        System.out.println(res);
        return res.intValue() > 0;
    }

    public boolean isMember(int id, String password) throws Exception
    {
        Ab01 ab01 = ab01Mapper.selectByPrimaryKey(id);
        if (ab01 == null)
        {
            /**
             * 用户不存在
             */
            return false;
        }
        if (ab01.getAab108().equals(password))
        {
            /**
             * 用户名密码匹配
             */
            return true;
        }
        else
        {
            /**
             * 用户名不匹配密码
             */
            return false;
        }
    }

    public Ab01 getMemberInfo(Integer aab101)throws Exception
    {
        return ab01Mapper.selectByPrimaryKey(aab101);
    }
}
