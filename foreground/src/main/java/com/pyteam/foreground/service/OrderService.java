package com.pyteam.foreground.service;

import com.pyteam.db.entity.AuctionPart;
import com.pyteam.db.mapper.AuctionMapper;
import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad02Example;
import com.pyteam.db.mbg.entity.Ad06;
import com.pyteam.db.mbg.entity.Ad06Example;
import com.pyteam.db.mbg.mapper.Ad02Mapper;
import com.pyteam.db.mbg.mapper.Ad06Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class OrderService
{
    @Autowired
    private Ad02Mapper ad02Mapper;

    @Autowired
    private Ad06Mapper ad06Mapper;

    /**
     * 更新拍卖信息表和关联表
     */
    @Transactional
    public void updateAd02AndAd06()
    {
        Ad02Example ad02Example = new Ad02Example();
        Ad02Example.Criteria ad02Criteria =ad02Example.createCriteria();
        ad02Criteria.andAad209EqualTo("1");
        List<Ad02> ad02List = ad02Mapper.selectByExample(ad02Example);
        if (ad02List == null)
        {
            return;
        }
        Date nowDate = new Date();
        for(Ad02 ad02:ad02List)
        {
            if(ad02.getAad211().before(nowDate))
            {
                ad02.setAad209("3");
                ad02Mapper.updateByPrimaryKey(ad02);

                Ad06Example ad06Example = new Ad06Example();
                Ad06Example.Criteria ad06Criteria = ad06Example.createCriteria();
                ad06Criteria.andAad201EqualTo(ad02.getAad201());
                List<Ad06> ad06List = ad06Mapper.selectByExample(ad06Example);
                if(ad06List == null)
                {
                    break;
                }
                for(Ad06 ad06:ad06List)
                {
                    if(ad06.getAad602() == ad02.getAad208())
                    {
                        ad06.setAad603("3");
                        ad06Mapper.updateByPrimaryKey(ad06);
                    }
                    else
                    {
                        ad06.setAad603("2");
                        ad06Mapper.updateByPrimaryKey(ad06);
                    }
                }
            }
        }
    }
}
