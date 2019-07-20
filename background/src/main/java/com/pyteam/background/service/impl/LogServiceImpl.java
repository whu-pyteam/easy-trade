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
    private final
    Af03Mapper af03Mapper;
    private final
    Af02Service af02Service;
    private final
    LogMapper logMapper;

    public LogServiceImpl(Af03Mapper af03Mapper, Af02Service af02Service, LogMapper logMapper)
    {
        this.af03Mapper = af03Mapper;
        this.af02Service = af02Service;
        this.logMapper = logMapper;
    }

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
        PageHelper.startPage(queryParam.getPageNum(), queryParam.getPageSize());
        return logMapper.getLogInfo(queryParam);
    }

    @Override
    public Af03 getLogDetail(Integer id)
    {
        return af03Mapper.selectByPrimaryKey(id);
    }


}
