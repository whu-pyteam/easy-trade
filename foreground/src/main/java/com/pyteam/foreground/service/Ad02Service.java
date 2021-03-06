package com.pyteam.foreground.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad02Example;
import com.pyteam.db.mbg.entity.Ad02Example.Criteria;
import com.pyteam.db.mbg.entity.Ad06;
import com.pyteam.db.mbg.entity.Ad06Example;
import com.pyteam.db.mbg.mapper.Ad02Mapper;
import com.pyteam.db.mbg.mapper.Ad06Mapper;
import com.pyteam.db.utils.QiniuUtil;
import com.pyteam.foreground.dto.Ad02Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private Ad06Mapper ad06Mapper;

    public boolean isBuy(int aab101, int aad201)
    {
        Ad02 ad02 = ad02Mapper.selectByPrimaryKey(aad201);
        if(ad02.getAab101().equals(aab101))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Map<String, Object> selectAll(int pageNum, int pageSize)
    {
        Ad02Example ad02Example = new Ad02Example();
        Criteria criteria = ad02Example.createCriteria();
        criteria.andAad209EqualTo("1");
        ad02Example.setOrderByClause("aad201 desc");
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<Ad02> ad02List = ad02Mapper.selectByExample(ad02Example);
        Map<String, Object> ad02Map = new HashMap<>();
        ad02Map.put("ad02List", ad02List);
        ad02Map.put("pageCount", page.getPages());
        return ad02Map;
    }

    /**
     * 依据拍卖物品流水号（aad201）更新当前最高价（aad208）
     * @param aad201
     * @param aad208
     * @return
     */
    public boolean updateAad208ByAad201(int aad201, BigDecimal aad208)
    {
        Ad02 ad02 = new Ad02();
        ad02.setAad201(aad201);
        ad02.setAad208(aad208);
        return ad02Mapper.updateByPrimaryKeySelective(ad02) > 0;
    }

    /**
     * 用户删除拍卖
     * @param aad201
     * @return
     */
    @Transactional
    public boolean deleteById(int aad201)
    {
        Ad02 ad02 = new Ad02();
        ad02.setAad201(aad201);
        ad02.setAad209("4");
        if(ad02Mapper.updateByPrimaryKeySelective(ad02) > 0)
        {
            Ad06Example ad06Example = new Ad06Example();
            Ad06Example.Criteria ad06Criteria = ad06Example.createCriteria();
            ad06Criteria.andAad201EqualTo(aad201);
            List<Ad06> ad06List = ad06Mapper.selectByExample(ad06Example);
            if(!ad06List.isEmpty())
            {
                for (Ad06 ad06:ad06List)
                {
                    ad06.setAad603("5");
                    if(ad06Mapper.updateByPrimaryKey(ad06) <= 0)
                    {
                        return false;
                    }
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * 依据用户流水号查看拍卖物品
     * @param aab101
     * @return
     */
    public Map<String, Object> findByUserId(int aab101, int pageNum, int pageSize)
    {
        Ad02Example ad02Example = new Ad02Example();
        Criteria criteria = ad02Example.createCriteria();
        criteria.andAab101EqualTo(aab101);
        criteria.andAad209Between("0", "3");
        ad02Example.setOrderByClause("aad201 desc");
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<Ad02> ad02List = ad02Mapper.selectByExample(ad02Example);
        Map<String, Object> ad02Map = new HashMap<>();
        ad02Map.put("ad02List", ad02List);
        ad02Map.put("pageCount", page.getPages());
        return ad02Map;
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
            ad02.setAad208(dto.getAad206());
            ad02.setAad209("0");  //未审核
            ad02.setAad210(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("2000-01-01 00:00"));
            ad02.setAad211(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dto.getAad211()));
            ad02.setAad212(new Date());
            int res = ad02Mapper.insert(ad02);
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
    public Map<String, Object> findByValue(String value, int pageNum, int pageSize)
    {
        Ad02Example ad02Example = new Ad02Example();
        Criteria criteria = ad02Example.createCriteria();
        criteria.andAad202Like("%" + value + "%");
        criteria.andAad209EqualTo("1");
        ad02Example.setOrderByClause("aad201 desc");
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<Ad02> ad02List = ad02Mapper.selectByExample(ad02Example);
        Map<String, Object> ad02Map = new HashMap<>();
        ad02Map.put("ad02List", ad02List);
        ad02Map.put("pageCount", page.getPages());
        return ad02Map;
    }

}
