package com.pyteam.background.controller;

import cn.hutool.json.JSONUtil;
import com.github.pagehelper.PageHelper;
import com.pyteam.background.dto.LogInfo;
import com.pyteam.background.dto.LogQueryParam;
import com.pyteam.background.dto.WebLog;
import com.pyteam.background.service.Af02Service;
import com.pyteam.background.service.LogService;
import com.pyteam.commons.api.CommonPage;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Af02;
import com.pyteam.db.mbg.entity.Af03;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/16 14:39
 */
@Api(tags = "日志操作")
@RestController
@RequestMapping("/log")
@PreAuthorize("hasAuthority('admin:emp')")
public class LogController
{
    @Autowired
    LogService logService;

    @ApiOperation("日志分页查询")
    @PostMapping("")
    public CommonResponse<CommonPage<LogInfo>> list(@RequestBody LogQueryParam queryParam)
    {
        List<LogInfo> list = logService.list(queryParam);
        if(list.size() == 0)
        {
            return CommonResponse.failed("查询失败, 没有满足条件的数据!");
        }
        return CommonResponse.success(CommonPage.restPage(list));
    }


    @ApiOperation("日志详情查询")
    @GetMapping("/{id}")
    public CommonResponse getLogDetail(@PathVariable("id") Integer id)
    {
        Af03 logDetail = logService.getLogDetail(id);
        WebLog webLog = JSONUtil.toBean(logDetail.getAaf302(), WebLog.class);
        return CommonResponse.success(webLog);
    }


}
