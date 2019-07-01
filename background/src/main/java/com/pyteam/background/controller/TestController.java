package com.pyteam.background.controller;

import com.pyteam.background.service.TestService;
import com.pyteam.db.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tyc
 * @date 2019/7/1 11:09
 */
@RestController
@RequestMapping("/test")
public class TestController
{

    @Autowired
    private TestService testService;

    @GetMapping("/query")
    public Test testQuery()
    {
        Test test = testService.selectByName("AAA");
        System.out.println(test);
        return test;
    }

}
