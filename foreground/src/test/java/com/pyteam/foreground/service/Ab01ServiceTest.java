package com.pyteam.foreground.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ab01ServiceTest
{
    @Autowired
    Ab01Service ab01Service;

    @Test
    public void test() throws Exception
    {
        ab01Service.addAb01();
    }
}
