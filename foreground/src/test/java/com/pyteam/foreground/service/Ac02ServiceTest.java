package com.pyteam.foreground.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ac02ServiceTest
{
    @Autowired
    Ac02Service service;

    @Test
    public void test() throws Exception
    {
        service.addAc02();
    }
}
