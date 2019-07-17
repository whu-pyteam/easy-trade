package com.pyteam.background.controller;

import com.pyteam.background.dto.ProductQueryParam;
import com.pyteam.background.dto.ProductUpdateParam;
import com.pyteam.background.service.Ac01Service;
import com.pyteam.commons.api.CommonPage;
import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.mbg.entity.Ac01;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author tyc
 * @date 2019/7/12 11:17
 */
@RestController
@RequestMapping("/product")
@PreAuthorize("hasAnyAuthority('admin:product', 'admin:emp')")
public class ProductController
{

    @Autowired
    Ac01Service ac01Service;

    @ApiOperation("分页查询商品信息")
    @GetMapping
    public CommonResponse<CommonPage<Ac01>> list(ProductQueryParam queryParam)
    {
        List<Ac01> ac01List = ac01Service.getAc01List(queryParam);

        return CommonResponse.success(CommonPage.restPage(ac01List));
    }


    @ApiOperation("商品信息单例查询")
    @GetMapping("/{id}")
    public CommonResponse<Ac01> getSingle(@PathVariable("id") Integer id)
    {
        Ac01 ac01 = ac01Service.getAc01(id);
        return  CommonResponse.success(ac01);
    }


    @ApiOperation("商品状态更新(审核)")
    @PutMapping("/{id}")
    public CommonResponse updateProduct(@RequestBody ProductUpdateParam updateParam)
    {
        if(ac01Service.updateAc01(updateParam.getId(), updateParam.getStatus()))
        {
            return CommonResponse.success("修改成功!");
        }
        return CommonResponse.failed("修改失败");
    }
}
