package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad02Example;
import com.pyteam.db.mbg.entity.Ad02Example.Criteria;
import com.pyteam.db.mbg.mapper.Ad02Mapper;
import com.pyteam.db.utils.QiniuUtil;
import com.pyteam.foreground.dto.Ad02Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 拍卖商品表ad02
 */
@Service
public class Ad02Service
{
    @Autowired
    private Ad02Mapper ad02Mapper;

    @Autowired
    private QiniuUtil qiniuUtil;



    public Ad02 findById(int id) throws Exception
    {
        return ad02Mapper.selectByPrimaryKey(id);
    }

    /**
     * 添加拍卖商品信息
     * @return 添加是否成功
     * @throws Exception
     */
    public boolean addAd02(Ad02Dto dto) throws Exception
    {
        Ad02 ad02 = new Ad02();
        ad02.setAab101(2);
        ad02.setAac201(1);
        ad02.setAad202(dto.getAad202());
        ad02.setAad203(qiniuUtil.uploadImg(dto.getAad203()));
        ad02.setAad204(dto.getAad204());
        ad02.setAad205(dto.getAad205());
        ad02.setAad206(dto.getAad206());
        ad02.setAad207(dto.getAad207());
        ad02.setAad208(BigDecimal.valueOf(2400));
        ad02.setAad209("0");  //未审核
        ad02.setAad210(new Date());
        ad02.setAad211(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-08-30 12:00:00"));
        System.out.println(ad02);
        int res = ad02Mapper.insert(ad02);
        System.out.println(res);
        return res > 0;
    }

    public List<Ad02> selectById() throws Exception
    {
        Ad02Example example = new Ad02Example();
        Criteria criteria = example.createCriteria();
        criteria.andAab101EqualTo(2);
        List<Ad02> ad02List = ad02Mapper.selectByExample(example);
        return ad02List;
    }

    public List<Ad02> searchByValue(String value) throws Exception
    {
        Ad02Example example = new Ad02Example();
        Criteria criteria = example.createCriteria();
        criteria.andAad202Like("%" + value + "%");
        List<Ad02> ad02List = ad02Mapper.selectByExample(example);
        return ad02List;
    }

}
