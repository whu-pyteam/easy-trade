package com.pyteam.background.mapper;

import com.pyteam.background.dto.LogInfo;
import com.pyteam.background.dto.LogQueryParam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/16 16:15
 */
@Repository
public interface LogMapper
{
    List<LogInfo> getLogInfo(LogQueryParam queryParam);
}
