package com.pyteam.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.pyteam.background.dto.LogInfo;
import com.pyteam.background.dto.LogQueryParam;
import com.pyteam.background.mapper.LogMapper;
import com.pyteam.background.service.Af02Service;
import com.pyteam.background.service.LogService;
import com.pyteam.db.mbg.entity.Af02;
import com.pyteam.db.mbg.entity.Af02Example;
import com.pyteam.db.mbg.entity.Af03;
import com.pyteam.db.mbg.entity.Af03Example;
import com.pyteam.db.mbg.mapper.Af03Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @author tyc
 * @date 2019/7/16 14:18
 */
@Service
public class LogServiceImpl implements LogService
{
    @Autowired
    Af03Mapper af03Mapper;
    @Autowired
    Af02Service af02Service;
    @Autowired
    LogMapper logMapper;

    @Override
    public void insert(Integer id, String log)
    {
        Af03 af03 = new Af03();
        af03.setAaf201(id);
        af03.setAaf302(log);
        af03.setAaf303(new Date());
        af03Mapper.insert(af03);
    }

    @Override
    public List<LogInfo> list(LogQueryParam queryParam)
    {
        // Af02 af02 = af02Service.getEmpByUsername(queryParam.getAaf202());
        // PageHelper.startPage(queryParam.getPageNum(), queryParam.getPageSize());
        // Af03Example example = new Af03Example();
        // Af03Example.Criteria criteria = example.createCriteria();
        // if(!StringUtils.isEmpty(queryParam.getAaf202()))
        // {
        //     criteria.andAaf201EqualTo(af02.getAaf201());
        // }
        //
        // return af03Mapper.selectByExample(example);
        PageHelper.startPage(queryParam.getPageNum(), queryParam.getPageSize());
        return logMapper.getLogInfo(queryParam);
    }

    @Override
    public Af03 getLogDetail(Integer id)
    {
        Af03 af03 = af03Mapper.selectByPrimaryKey(id);
        return af03;
    }


}
