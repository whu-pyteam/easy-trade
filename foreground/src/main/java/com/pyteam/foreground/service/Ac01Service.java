package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.*;
import com.pyteam.db.mbg.mapper.Ac01Mapper;
import com.pyteam.db.mbg.mapper.Ac02Mapper;
import com.pyteam.db.mbg.mapper.Ac04Mapper;
import com.pyteam.db.mbg.mapper.Ae06Mapper;
import com.pyteam.foreground.dto.Ac01Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pyteam.db.utils.QiniuUtil;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class Ac01Service
{
    @Autowired
    private Ac01Mapper ac01Mapper;
    @Autowired
    private Ae06Mapper ae06Mapper;
    @Autowired
    private Ac04Mapper ac04Mapper;
    @Autowired
    private Ac02Mapper ac02Mapper;
    @Autowired
    private QiniuUtil qiniuUtil;

    /**
     * 根据id获取商品
     * @param id
     * @return
     * @throws Exception
     */
    public Ac01 findById(int id) throws Exception
    {
        return ac01Mapper.selectByPrimaryKey(id);
    }

    /**
     * 获取商品列表
     * @return
     * @throws Exception
     */
    public List<Ac01> selectById() throws Exception
    {
        Ac01Example ac01Example=new Ac01Example();
        Ac01Example.Criteria criteria = ac01Example.createCriteria();
        criteria.andAac104EqualTo("1");
        List<Ac01> ac01List = ac01Mapper.selectByExample(ac01Example);
        return ac01List;
    }

    /**
     * 获取未出售的商品
     * @return
     * @throws Exception
     */
    public List<Ac01> getUnsoldGoodList() throws Exception
    {
        Ac01Example ac01Example=new Ac01Example();
        Ac01Example.Criteria criteria = ac01Example.createCriteria();
        criteria.andAac104EqualTo("1");
        List<Ac01> ac01List = ac01Mapper.selectByExample(ac01Example);

        Ae06Example ae06Example=new Ae06Example();
        List<Ae06> ae06List=ae06Mapper.selectByExample(ae06Example);


        Iterator<Ac01> ac01Iterator=ac01List.iterator();
        while (ac01Iterator.hasNext())
        {
            Ac01 tempAc01=ac01Iterator.next();
            for(int i=0;i<ae06List.size();i++)
            {
                if(tempAc01.getAac101().equals(ae06List.get(i).getAac101()))
                {
                    ac01Iterator.remove();
                }
            }
        }
        return ac01List;
    }


    /**
     * 删除商品
     * @param aac101
     */
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteGood(Integer aac101)
    {
        try
        {
            Ac04Example ac04Example = new Ac04Example();
            Ac04Example.Criteria criteria = ac04Example.createCriteria();
            criteria.andAac101EqualTo(aac101);
            ac04Mapper.deleteByExample(ac04Example);

            ac01Mapper.deleteByPrimaryKey(aac101);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * 根据商品名称查询
     * @param value
     * @return
     * @throws Exception
     */
    public List<Ac01> searchByValue(String value) throws Exception
    {
        Ac01Example ac01Example = new Ac01Example();
        Ac01Example.Criteria criteria = ac01Example.createCriteria();
        criteria.andAac102Like("%" + value + "%");
        criteria.andAac104EqualTo("1");
        List<Ac01> ad02List = ac01Mapper.selectByExample(ac01Example);
        return ad02List;
    }

    /**
     * 添加商品
     * @param ac01Dto
     * @return
     * @throws Exception
     */
    public boolean addAc01(Ac01Dto ac01Dto)throws Exception
    {
        Ac01 ac01 = new Ac01();

        ac01.setAab101(ac01Dto.getAab101());

        String aac202=ac01Dto.getAac202();
        Ac02Example ac02Example=new Ac02Example();
        Ac02Example.Criteria criteria=ac02Example.createCriteria();
        criteria.andAac202EqualTo(aac202);
        List<Ac02> ac02List=ac02Mapper.selectByExample(ac02Example);
        if(ac02List.size()==1)
        {
            ac01.setAac201(ac02List.get(0).getAac201());
        }
        else
        {
            ac01.setAac201(1);
        }

        ac01.setAac102(ac01Dto.getAac102());

        ac01.setAac103(ac01Dto.getAac103());

        ac01.setAac104("0");

        ac01.setAac105(ac01Dto.getAac105());

        ac01.setAac106(qiniuUtil.uploadImg(ac01Dto.getAac106()));

        ac01.setAac107(new Date());

        int res = ac01Mapper.insert(ac01);
        return res > 0;
    }

    /**
     * 根据商品类别获取商品
     * @param aac201
     * @return
     */
    public List<Ac01> getByCategory(Integer aac201)
    {
        Ac01Example ac01Example= new Ac01Example();
        Ac01Example.Criteria criteria= ac01Example.createCriteria();
        criteria.andAac201EqualTo(aac201);
        return ac01Mapper.selectByExample(ac01Example);
    }

    /**
     * 根据商品卖家id获取商品
     * @param aab101
     * @return
     */
    public List<Ac01> getByOwner(Integer aab101)
    {
        Ac01Example ac01Example=new Ac01Example();
        Ac01Example.Criteria criteria=ac01Example.createCriteria();
        criteria.andAab101EqualTo(aab101);
        return ac01Mapper.selectByExample(ac01Example);
    }

}
