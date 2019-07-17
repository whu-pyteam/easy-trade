package com.pyteam.background.controller;

import com.pyteam.background.dto.FeedbackQueryParam;
import com.pyteam.background.dto.FeedbackUpdateParam;
import com.pyteam.background.service.FeedbackService;
import com.pyteam.commons.api.CommonPage;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Ab05;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/15 15:56
 */
@Api("FeedbackController -- 反馈管理")
@RestController
@RequestMapping("/feedback")
@PreAuthorize("hasAnyAuthority('admin:feedback', 'admin:emp')")
public class FeedbackController
{
    @Autowired
    FeedbackService feedbackService;


    @ApiOperation("反馈分页查询")
    @PostMapping("")
    public CommonResponse<CommonPage<Ab05>> list(@RequestBody FeedbackQueryParam queryParam)
    {
        List<Ab05> list = feedbackService.list(queryParam);
        if(list.size() > 0)
        {
            return CommonResponse.success(CommonPage.restPage(list));
        }
        return CommonResponse.failed("没有满足条件的数据");
    }

    @ApiOperation("反馈单例查询")
    @GetMapping("/{id}")
    public CommonResponse<Ab05> getAb05ById(@PathVariable("id") Integer id)
    {
        Ab05 ab05 = feedbackService.getAb05ByAab501(id);
        if(ab05 != null)
        {
            return CommonResponse.success(ab05);
        }
        return CommonResponse.failed("操作失败");
    }

    @ApiOperation("反馈更新")
    @PutMapping("/{id}")
    public CommonResponse updateFeedback(@PathVariable("id") Integer id, FeedbackUpdateParam updateParam)
    {
        boolean b = feedbackService.updateFeedback(id, updateParam);
        if(b)
        {
            return CommonResponse.success("更新成功");
        }
        return CommonResponse.failed("操作失败");
    }
}
