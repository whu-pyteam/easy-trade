package com.pyteam.db;

import com.pyteam.db.mapper.TestMapper;
import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.mapper.Ab01Mapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbApplicationTests
{

    @Autowired
    private Ab01Mapper ab01Mapper;

    @Test
    @Rollback
    public void findByName() throws Exception
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
    }



}
