package com.pyteam.foreground.controller;

import com.pyteam.foreground.service.TestService;
//import com.pyteam.db.mbg.entity.Test;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tyc
 * @date 2019/7/1 11:09
 */
@Api(tags = {"TestController"})
@RestController
@RequestMapping("/test")
public class TestController
{

    // @Autowired
    // private TestService testService;
    //
    // @ApiOperation("查询测试")
    // @GetMapping("/query")
    // public Test testQuery()
    // {
    //     Test test = testService.selectByName("AAA");
    //     System.out.println(test);
    //     return test;
    // }

}
