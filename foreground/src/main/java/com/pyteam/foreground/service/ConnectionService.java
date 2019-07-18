package com.pyteam.foreground.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pyteam.db.entity.AuctionConn;
import com.pyteam.db.mapper.AuctionMapper;
import com.pyteam.db.mbg.entity.*;
import com.pyteam.db.mbg.mapper.Ad04Mapper;
import com.pyteam.db.mbg.mapper.Ae05Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    public List<Ad02> selectAd02RightAe05(int aad401, int pageNum, int pageSize)
    {
        PageHelper.startPage(pageNum, pageSize);
        List<Ad02> ad02List = auctionMapper.selectAd02RightAe05(aad401);
        for(Ad02 ad02:ad02List)
        {
            Date aad211 = ad02.getAad211();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
            String date = sf.format(aad211);
            ad02.setAad204(date);
        }
        return ad02List;
    }

    public List<AuctionConn> selectAd02LeftAe05(int aad401)
    {
        return auctionMapper.selectAd02LeftAe05(aad401);
    }

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
