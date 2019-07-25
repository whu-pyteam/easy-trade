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

import java.text.SimpleDateFormat;
import java.util.*;

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
        Map<String, Object> result = new LinkedHashMap<>(9);
        result.put("操作人名称", webLog.getUsername());
        result.put("操作描述", webLog.getDescription());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf( webLog.getStartTime()))));
        result.put("操作开始时间", sd);
        result.put("操作花费时间(ms)", webLog.getSpendTime());
        result.put("操作uri", webLog.getUri());
        result.put("操作uri方法", webLog.getMethod());
        result.put("操作终端IP", webLog.getIp());
        result.put("操作参数", webLog.getParameter());
        result.put("操作结果", webLog.getResult());
        return CommonResponse.success(result);
    }


}
