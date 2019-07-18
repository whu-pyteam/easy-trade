package com.pyteam.foreground.service;

import com.pyteam.db.entity.AuctionConn;
import com.pyteam.db.mapper.AuctionMapper;
import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.entity.Ad04Example;
import com.pyteam.db.mbg.entity.Ae05;
import com.pyteam.db.mbg.entity.Ae05Example;
import com.pyteam.db.mbg.mapper.Ad04Mapper;
import com.pyteam.db.mbg.mapper.Ae05Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConnectionService
{
    @Autowired
    private Ad04Mapper ad04Mapper;

    @Autowired
    private Ae05Mapper ae05Mapper;

    @Autowired
    private AuctionMapper auctionMapper;

    public List<AuctionConn> selectAd02AndAe05(int aab101, String aad402)
    {
        Ad04Example ad04Example = new Ad04Example();
        Ad04Example.Criteria ad04Criteria = ad04Example.createCriteria();
        ad04Criteria.andAab101EqualTo(aab101);
        ad04Criteria.andAad402EqualTo(aad402);
        List<Ad04> ad04List = ad04Mapper.selectByExample(ad04Example);
        int aad401 = 0;
        if(!ad04List.isEmpty())
        {
            aad401= ad04List.get(0).getAad401();
        }
        return auctionMapper.selectAd02AndAe05(aad401);
    }

    public List<Ae05> selectByValue(int aab101, String aad402)
    {
        Ad04Example ad04Example = new Ad04Example();
        Ad04Example.Criteria ad04Criteria = ad04Example.createCriteria();
        ad04Criteria.andAab101EqualTo(aab101);
        ad04Criteria.andAad402EqualTo(aad402);
        List<Ad04> ad04List = ad04Mapper.selectByExample(ad04Example);
        if(ad04List.isEmpty())
        {
            return null;
        }
        else
        {
            int aad401 = ad04List.get(0).getAad401();
            Ae05Example ae05Example = new Ae05Example();
            Ae05Example.Criteria ae05criteria = ae05Example.createCriteria();
            ae05criteria.andAad401EqualTo(aad401);
            return ae05Mapper.selectByExample(ae05Example);
        }
    }

    @Transactional
    public boolean delByValue(Ae05 ae05)
    {
        Ae05Example ae05Example = new Ae05Example();
        Ae05Example.Criteria ae05criteria = ae05Example.createCriteria();
        ae05criteria.andAad401EqualTo(ae05.getAad401());
        ae05criteria.andAad201EqualTo(ae05.getAad201());
        return ae05Mapper.deleteByExample(ae05Example) > 0;
    }

    public boolean insert(Ae05 ae05)
    {
        return ae05Mapper.insert(ae05) > 0;
    }
}
