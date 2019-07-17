package com.pyteam.background.service;

import com.pyteam.background.dto.LogInfo;
import com.pyteam.background.dto.LogQueryParam;
import com.pyteam.background.dto.WebLog;
import com.pyteam.db.mbg.entity.Af03;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/16 11:53
 */
public interface LogService
{
    /**
     * 插入日志
     * @param id
     * @param log
     */
    void insert(Integer id, String log);


    /**
     * 根据用户名查找日志
     * @param queryParam
     * @return
     */
    List<LogInfo> list(LogQueryParam queryParam);

    Af03 getLogDetail(Integer id);
}
