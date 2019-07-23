package com.pyteam.foreground.service;

import com.pyteam.db.entity.AuctionPart;
import com.pyteam.db.mapper.AuctionMapper;
import com.pyteam.db.mbg.entity.*;
import com.pyteam.db.mbg.mapper.Ac05Mapper;
import com.pyteam.db.mbg.mapper.Ad02Mapper;
import com.pyteam.db.mbg.mapper.Ad06Mapper;
import com.pyteam.db.mbg.mapper.Ae08Mapper;
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

    @Autowired
    private Ac05Mapper ac05Mapper;

    @Autowired
    private Ae08Mapper ae08Mapper;

    public List<Ad02> myLauState(List<Ad02> ad02List)
    {
        for(int i = 0; i < ad02List.size(); i++)
        {
            if (ad02List.get(i).getAad209().equals("3"))
            {
                Ac05 ac05 = this.selectAc05Byaad201(ad02List.get(i).getAad201());
                if(ac05 != null)
                {
                    switch (ac05.getAac503())
                    {
                        case 0:
                            ad02List.get(i).setAad209("5"); //待发货
                            break;
                        case 1:
                            ad02List.get(i).setAad209("6"); //已发货
                            break;
                        case 2:
                            ad02List.get(i).setAad209("7"); //已完成
                            break;
                    }
                }
            }
        }
        return ad02List;
    }

    public boolean deliverAuc(int aac501)
    {
        Ac05 ac05 = ac05Mapper.selectByPrimaryKey(aac501);
        if (ac05 == null)
        {
            return false;
        }
        ac05.setAac503(1);
        if (ac05Mapper.updateAac503ByPrimaryKey(ac05) > 0)
        {
            return true;
        }
        return false;
    }

    @Transactional
    public boolean takenAuc(int aab101, int aad201, int aac501)
    {
        boolean res = true;
        Ad06Example ad06Example = new Ad06Example();
        Ad06Example.Criteria criteria = ad06Example.createCriteria();
        criteria.andAab101EqualTo(aab101);
        criteria.andAad201EqualTo(aad201);
        List<Ad06> ad06List = ad06Mapper.selectByExample(ad06Example);
        if(ad06List.isEmpty())
        {
            return false;
        }
        Ad06 ad06 = ad06List.get(0);
        ad06.setAad603("7");
        if (ad06Mapper.updateByPrimaryKey(ad06) <= 0)
        {
            res = false;
        }

        Ac05 ac05 = ac05Mapper.selectByPrimaryKey(aac501);
        if (ac05 == null)
        {
            return false;
        }
        ac05.setAac503(2);
        if (ac05Mapper.updateAac503ByPrimaryKey(ac05) <= 0)
        {
            res = false;
        }
        return res;
    }

    public Ac05 selectAc05Byaad201(int aad201)
    {
        Ae08Example ae08Example = new Ae08Example();
        Ae08Example.Criteria criteria = ae08Example.createCriteria();
        criteria.andAad201EqualTo(aad201);
        List<Ae08> ae08 = ae08Mapper.selectByExample(ae08Example);
        if (ae08.isEmpty())
        {
            return null;
        }
        else
        {
            int aac501 = ae08.get(0).getAac501();
            return ac05Mapper.selectByPrimaryKey(aac501);
        }
    }

    @Transactional
    public boolean addAucOrder(Ac05 ac05, int aad201, int aad601)
    {
        boolean res = true;
        ac05.setAac502("201907230001");
        ac05.setAac503(0);
        ac05.setAac508("3");
        ac05.setAac511(new Date());
        if(ac05Mapper.insert(ac05) <= 0)
        {
            res = false;
        }
        Ae08 ae08 = new Ae08();
        ae08.setAad201(aad201);
        ae08.setAac501(ac05.getAac501());
        if(ae08Mapper.insert(ae08) <= 0)
        {
            res = false;
        }
        Ad06 ad06 = ad06Mapper.selectByPrimaryKey(aad601);
        ad06.setAad603("4");
        if(ad06Mapper.updateByPrimaryKey(ad06) <= 0)
        {
            res = false;
        }

        return res;
    }

    public Ac05 getAucOrder(int aab101, int aad601)
    {
        Ad06 ad06 = ad06Mapper.selectByPrimaryKey(aad601);
        if((ad06.getAab101() == aab101) && ad06.getAad603().equals("3"))
        {
            Ac05 ac05 = new Ac05();
            ac05.setAac502("201907230001");
            ac05.setAac505(ad06.getAad602());
            return ac05;
        }
        else
        {
            System.out.println("......................");
            return null;
        }
    }

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
                ad06Criteria.andAad603EqualTo("1");
                List<Ad06> ad06List = ad06Mapper.selectByExample(ad06Example);
                if(ad06List == null)
                {
                    break;
                }
                boolean isSet = false;
                for(Ad06 ad06:ad06List)
                {
                    if(!isSet && (ad06.getAad602().compareTo(ad02.getAad208()) == 0))
                    {
                        ad06.setAad603("3");
                        ad06Mapper.updateByPrimaryKey(ad06);
                        isSet = true;
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
