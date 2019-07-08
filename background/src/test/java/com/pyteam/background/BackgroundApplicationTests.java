package com.pyteam.background;

import com.pyteam.background.dto.StaffLoginParam;
import com.pyteam.background.service.Af02Service;
import com.pyteam.db.mbg.entity.Af02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackgroundApplicationTests
{
    @Autowired
    Af02Service af02Service;

    @Test
    @Rollback
    public void register() throws Exception
    {
        StaffLoginParam loginParam = new StaffLoginParam();
        loginParam.setPassword("123456");
        loginParam.setUsername("admin");
        af02Service.register(loginParam);
    }

}
