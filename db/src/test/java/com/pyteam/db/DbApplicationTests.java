package com.pyteam.db;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

// @RunWith(SpringRunner.class)
// @SpringBootTest
// public class DbApplicationTests
// {
//
//     @Autowired
//     private TestMapper testMapper;
//
//     @Test
//     @Rollback
//     public void findByName() throws Exception
//     {
//         // testMapper.insert("BBB", 12);
//         com.pyteam.db.mbg.entity.Test u = testMapper.findByName("BBB");
//         Assert.assertEquals(12, u.getAge().intValue());
//     }
// }
