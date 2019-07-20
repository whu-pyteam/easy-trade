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

    public boolean deleteById(int aad201)
    {
        Ad02 ad02 = new Ad02();
        ad02.setAad201(aad201);
        ad02.setAad209("3");
        return ad02Mapper.updateByPrimaryKeySelective(ad02) > 0;
    }

    /**
     * 依据用户流水号查看拍卖物品
     * @param aab101
     * @return
     */
    public List<Ad02> findByUserId(int aab101)
    {
        Ad02Example ad02Example = new Ad02Example();
        Criteria criteria = ad02Example.createCriteria();
        criteria.andAab101EqualTo(aab101);
        //criteria.andAad209EqualTo("1");
        criteria.andAad209Between("0", "2");
        return ad02Mapper.selectByExample(ad02Example);
    }

    /**
     * 依据拍卖物品流水号查看拍卖物品
     * @param aad201
     * @return
     */
    public Ad02 findById(int aad201)
    {
        return ad02Mapper.selectByPrimaryKey(aad201);
    }

    /**
     * 添加拍卖商品信息
     * @return 添加是否成功
     * @throws Exception
     */
    public boolean insert(Ad02Dto dto)
    {
        try
        {
            Ad02 ad02 = new Ad02();
            ad02.setAab101(dto.getAab101());
            ad02.setAac201(1);
            ad02.setAad202(dto.getAad202());
            ad02.setAad203(qiniuUtil.uploadImg(dto.getAad203()));
            ad02.setAad204(dto.getAad204());
            ad02.setAad205(dto.getAad205());
            ad02.setAad206(dto.getAad206());
            ad02.setAad207(dto.getAad207());
            ad02.setAad208(BigDecimal.valueOf(2400));
            ad02.setAad209("0");  //未审核
            ad02.setAad210(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("2000-01-01 00:00"));
            ad02.setAad211(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dto.getAad211()));
            ad02.setAad212(new Date());
            System.out.println(ad02);
            int res = ad02Mapper.insert(ad02);
            System.out.println(res);
            return res > 0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 依据拍卖页面搜索栏信息查找拍卖物品
     * @param value
     * @return
     */
    public List<Ad02> findByValue(String value)
    {
        Ad02Example example = new Ad02Example();
        Criteria criteria = example.createCriteria();
        criteria.andAad202Like("%" + value + "%");
        List<Ad02> ad02List = ad02Mapper.selectByExample(example);
        return ad02List;
    }

}
