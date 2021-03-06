package com.pyteam.background.service;

import com.pyteam.db.entity.Test;
import com.pyteam.db.mapper.TestMapper;
import org.springframework.stereotype.Service;

/**
 * @author tyc
 * @date 2019/7/1 11:10
 */
@Service
public class TestService
{
    private final TestMapper testMapper;

    public TestService(TestMapper testMapper)
    {
        this.testMapper = testMapper;
    }

    /**
     * 根据名字查找
     */
    public Test selectByName(String name) {
        return testMapper.findByName(name);
    }
}
