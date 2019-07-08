package com.pyteam.foreground.controller;

import io.swagger.annotations.Api;
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
