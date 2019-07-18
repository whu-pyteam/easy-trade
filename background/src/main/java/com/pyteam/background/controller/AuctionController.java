package com.pyteam.background.controller;

import com.pyteam.background.dto.AuctionQueryParam;
import com.pyteam.background.service.AuctionService;
import com.pyteam.commons.api.CommonPage;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Ad02;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/15 8:55
 */
@Api(tags = "AuctionController --- 拍卖管理")
@RestController
@RequestMapping("/auction")
@PreAuthorize("hasAnyAuthority('admin:auction', 'admin:emp')")

public class AuctionController
{
    @Autowired
    AuctionService auctionService;

    @ApiOperation("拍卖分页查询")
    @PostMapping("")
    public CommonResponse<CommonPage<Ad02>> list(@RequestBody AuctionQueryParam queryParam)
    {
        List<Ad02> ad02List = auctionService.list(queryParam);
        if(ad02List.size() >0)
        {
            return CommonResponse.success(CommonPage.restPage(ad02List), "查询成功");
        }
        return CommonResponse.failed("查询失败, 没有符合条件的数据");
    }


    @ApiOperation("拍卖单例查询")
    @GetMapping("/{id}")
    public CommonResponse<Ad02> getAuctionById(@PathVariable("id") Integer id)
    {
        Ad02 auction = auctionService.getAuctionByAad201(id);
        if(auction != null)
        {
            return CommonResponse.success(auction);
        }
        return CommonResponse.failed("操作失败");
    }


    @ApiOperation("拍卖审核更新")
    @PutMapping("/{id}")
    public CommonResponse<Boolean> updateAuction(@PathVariable("id") Integer id, @RequestParam String aad209)
    {
        boolean b = auctionService.updateAuction(id, aad209);
        if(b)
        {
        return CommonResponse.success(b, "操作成功!");

        }
        return CommonResponse.failed("操作失败!");
    }

}
