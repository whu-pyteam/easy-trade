package com.pyteam.background.controller;

import com.pyteam.commons.api.CommonResponse;
import com.pyteam.db.utils.QiniuUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tyc
 * @date 2019/7/9 15:10
 */
@Log
@Api(tags = {"七牛云上传图片"})
@RestController
@RequestMapping("/admin")
public class QiniuController
{
    @Autowired
    QiniuUtil qiniuUtil;

    @ApiOperation("上传图片至七牛云")
    @PostMapping("/uploadImg")
    public CommonResponse uploadImg(@RequestParam("file") MultipartFile multipartFile)
    {
        String avatarUrl;
        try
        {
            avatarUrl = qiniuUtil.uploadImg(multipartFile);
        } catch(IOException e)
        {
            e.printStackTrace();
            return CommonResponse.failed("图片上传失败");
        }
        Map<String, String> data = new HashMap<>(1);
        data.put("avatarUrl", avatarUrl);
        return CommonResponse.success(data);
    }
}
