package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ae06;
import com.pyteam.db.mbg.mapper.Ac05Mapper;
import com.pyteam.db.mbg.mapper.Ae06Mapper;
import com.pyteam.foreground.dto.Ac05Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class Ac05Service
{
    @Autowired
    Ac05Mapper ac05Mapper;
    @Autowired
    Ae06Mapper ae06Mapper;

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
}
