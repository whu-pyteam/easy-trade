package com.pyteam.background.controller;

import com.pyteam.background.dto.RewardQueryParam;
import com.pyteam.background.dto.RewardUpdateParam;
import com.pyteam.background.service.RewardService;
import com.pyteam.commons.api.CommonPage;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Ad01;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/13 14:05
 */
@Api(tags = "RewardController -- 悬赏管理")
@RestController
@RequestMapping("/reward")
@PreAuthorize("hasAnyAuthority('admin:reward', 'admin:emp')")
public class RewardController
{

    @Autowired
    RewardService rewardService;

    @ApiOperation("悬赏分页查询")
    @PostMapping
    public CommonResponse<CommonPage<Ad01>> list(@RequestBody RewardQueryParam queryParam)
    {
        List<Ad01> list = rewardService.list(queryParam);
        if(list.size() == 0)
        {
            return CommonResponse.failed("查询失败, 没有满足条件的数据!");
        }
        return CommonResponse.success(CommonPage.restPage(list));
    }


    @ApiOperation("悬赏单例查询")
    @GetMapping("/{id}")
    public CommonResponse<Ad01> getAd01ByAad101(@PathVariable("id") Integer id)
    {
        Ad01 ad01 = rewardService.getAd01ByAad101(id);
        if(ad01 != null)
        {
            return CommonResponse.success(ad01);
        }
        return CommonResponse.failed("数据未找到!");
    }

    @ApiOperation("悬赏审核")
    @PutMapping("/{id}")
    public CommonResponse updateRewardStatus(@PathVariable("id")Integer id,  @RequestBody RewardUpdateParam updateParam)
    {

        if(rewardService.updateAd01Status(id, updateParam.getStatus()))
        {
            return CommonResponse.success("success", "操作成功");
        }
        return CommonResponse.failed("操作失败");
    }
}
