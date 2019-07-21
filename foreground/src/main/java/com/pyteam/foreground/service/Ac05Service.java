package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.*;
import com.pyteam.db.mbg.mapper.Ac01Mapper;
import com.pyteam.db.mbg.mapper.Ac05Mapper;
import com.pyteam.db.mbg.mapper.Ae06Mapper;
import com.pyteam.foreground.dto.Ac05Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class Ac05Service
{
    @Autowired
    Ac05Mapper ac05Mapper;
    @Autowired
    Ae06Mapper ae06Mapper;
    @Autowired
    Ac01Mapper ac01Mapper;

    /**
     * 为商品创建订单
     * @param ac05Dto
     * @param aac101
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public boolean createGoodOrder(Ac05Dto ac05Dto,Integer aac101)
    {
        Ac05 ac05 = new Ac05();
        ac05.setAab101(ac05Dto.getAab101());
        ac05.setAac502("123456789");//订单编号
        ac05.setAac503(0);
        ac05.setAac504(ac05Dto.getAac504());
        ac05.setAac505(ac05Dto.getAac505());
        ac05.setAac506(ac05Dto.getAac506());
        ac05.setAac507(ac05Dto.getAac507());
        ac05.setAac508("1");
        ac05.setAac509(ac05Dto.getAac509());
        ac05.setAac510(ac05Dto.getAac510());
        ac05.setAac511(new Date());
        ac05Mapper.insert(ac05);

        //将订单编号和商品编号插入商品-订单关联表
        Ae06 ae06=new Ae06();
        ae06.setAac501(ac05.getAac501());
        ae06.setAac101(aac101);
        ae06Mapper.insert(ae06);
        return true;
    }

    public Ac05 getBuyerId(Integer aac101)
    {
        Ae06Example ae06Example= new Ae06Example();
        Ae06Example.Criteria criteria=ae06Example.createCriteria();
        criteria.andAac101EqualTo(aac101);
        List<Ae06> ae06List = ae06Mapper.selectByExample(ae06Example);
        if(ae06List.size()==1)
        {
            Integer aac501 = ae06List.get(0).getAac501();
            Ac05 ac05 = ac05Mapper.selectByPrimaryKey(aac501);
            return ac05;
        }
        else
        {
            return null;
        }
    }

    public boolean sendGood(Integer aac101)
    {
        Ae06Example ae06Example= new Ae06Example();
        Ae06Example.Criteria criteria=ae06Example.createCriteria();
        criteria.andAac101EqualTo(aac101);
        List<Ae06> ae06List = ae06Mapper.selectByExample(ae06Example);
        if(ae06List.size()==1)
        {
            Ac05 ac05 =new Ac05();
            ac05.setAac501(ae06List.get(0).getAac501());
            ac05.setAac503(1);
            ac05Mapper.updateAac503ByPrimaryKey(ac05);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean receiveGood(Integer aac101)
    {
        Ae06Example ae06Example= new Ae06Example();
        Ae06Example.Criteria criteria=ae06Example.createCriteria();
        criteria.andAac101EqualTo(aac101);
        List<Ae06> ae06List = ae06Mapper.selectByExample(ae06Example);
        if(ae06List.size()==1)
        {
            Ac05 ac05 =new Ac05();
            ac05.setAac501(ae06List.get(0).getAac501());
            ac05.setAac503(2);
            ac05Mapper.updateAac503ByPrimaryKey(ac05);
            return true;
        }
        else
        {
            return false;
        }
    }

    public List<Ac01> getByOrder(Integer aab101)
    {
        Ac05Example ac05Example=new Ac05Example();
        Ac05Example.Criteria criteria=ac05Example.createCriteria();
        criteria.andAab101EqualTo(aab101);
        criteria.andAac508EqualTo("1");
        List<Ac05> ac05List = ac05Mapper.selectByExample(ac05Example);

        List<Ac01> ac01List=new ArrayList<>();
        for(int i=0;i<ac05List.size();i++)
        {
            Ae06Example ae06Example=new Ae06Example();
            Ae06Example.Criteria criteria1=ae06Example.createCriteria();
            criteria1.andAac501EqualTo(ac05List.get(i).getAac501());
            List<Ae06> ae06List = ae06Mapper.selectByExample(ae06Example);
            if(ae06List.size()==1)
            {
                ac01List.add(ac01Mapper.selectByPrimaryKey(ae06List.get(0).getAac101()));
            }
        }
        return ac01List;
    }
}
