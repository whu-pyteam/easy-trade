package com.pyteam.foreground.service;

import com.github.pagehelper.Page;
import com.pyteam.db.mbg.entity.Ac04;
import com.pyteam.db.mbg.entity.Ac04Example;
import com.pyteam.db.mbg.entity.Ae06;
import com.pyteam.db.mbg.entity.Ae06Example;
import com.pyteam.db.mbg.mapper.Ac04Mapper;

import com.pyteam.db.mbg.mapper.Ae06Mapper;
import com.pyteam.foreground.dto.Ac04Dto;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;
import java.util.List;

@Service
public class Ac04Service
{
    @Autowired
    private Ac04Mapper ac04Mapper;
    @Autowired
    private Ae06Mapper ae06Mapper;

    /**
     * 商品是否已经在购物车
     * @param aac301
     * @param aac101
     * @return
     * @throws Exception
     */
    public boolean isExist(Integer aac301,Integer aac101)throws Exception
    {
        Ac04Example ac04Example = new Ac04Example();
        Ac04Example.Criteria criteria = ac04Example.createCriteria();
        criteria.andAac101EqualTo(aac101);
        criteria.andAac301EqualTo(aac301);
        List<Ac04> ac04List=ac04Mapper.selectByExample(ac04Example);
        if(ac04List.size()!=0)
        {
            return true;
        }
        return false;
    }

    public boolean isBought(Integer aac101)throws Exception
    {
        Ae06Example ae06Example=new Ae06Example();
        Ae06Example.Criteria criteria=ae06Example.createCriteria();
        criteria.andAac101EqualTo(aac101);
        List<Ae06> ae06List=ae06Mapper.selectByExample(ae06Example);
        if(ae06List.size()==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }


    /**
     * 将商品加入购物车
     * @param dto
     * @throws Exception
     */
    public void addToCart(Ac04Dto dto)throws Exception
    {
        Ac04 ac04 = new Ac04();
        ac04.setAac301(dto.getAac301());
        ac04.setAac101(dto.getAac101());
        ac04.setAac402(new Date());
        ac04Mapper.insert(ac04);
    }

    /**
     * 获取购物车中商品
     * @param aac301
     * @return
     */
    public List<Ac04> getCartItemList(Integer aac301)
    {
         Ac04Example ac04Example = new Ac04Example();
         Ac04Example.Criteria criteria = ac04Example.createCriteria();
         criteria.andAac301EqualTo(aac301);
         List<Ac04> ac04List = ac04Mapper.selectByExample(ac04Example);
         return ac04List;
    }

    /**
     * 从购物车删除一个商品
     * @param aac101
     * @return
     */
    public int deleteFromCart(Integer aac101,Integer aac301)
    {
        Ac04Example ac04Example = new Ac04Example();
        Ac04Example.Criteria criteria = ac04Example.createCriteria();
        criteria.andAac101EqualTo(aac101);
        criteria.andAac301EqualTo(aac301);
        int res = ac04Mapper.deleteByExample(ac04Example);
        return res;
    }


    /**
     * 批量删除购物车商品
     * @param idArray
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public boolean patchDelete(String[] idArray,Integer aac301)
    {
        try
        {
            for(String str : idArray)
            {
                Integer id = Integer.parseInt(str);

                Ac04Example ac04Example = new Ac04Example();
                Ac04Example.Criteria criteria = ac04Example.createCriteria();
                criteria.andAac101EqualTo(id);
                criteria.andAac301EqualTo(aac301);
                ac04Mapper.deleteByExample(ac04Example);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();

            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();

            return false;
        }
    }

}
