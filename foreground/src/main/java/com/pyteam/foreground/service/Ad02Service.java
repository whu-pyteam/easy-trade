package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.mapper.Ad02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * 拍卖商品表ad02
 */
@Service
public class Ad02Service
{
    @Autowired
    private Ad02Mapper ad02Mapper;

    /**
     * 添加拍卖商品信息
     * @return 添加是否成功
     * @throws Exception
     */
    public boolean addAd02(Ad02 ad02) throws Exception
    {
        ad02.setAab101(2);
        ad02.setAac201(1);
        ad02.setAad207(BigDecimal.valueOf(2400));
        ad02.setAad208("0");  //未审核
        ad02.setAad209(new Date());
        ad02.setAad210(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-30 12:00:00"));
        System.out.println(ad02);
        int res = ad02Mapper.insert(ad02);
        System.out.println(res);
        return res > 0;
    }
}
