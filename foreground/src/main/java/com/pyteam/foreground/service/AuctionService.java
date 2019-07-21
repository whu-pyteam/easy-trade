package com.pyteam.foreground.service;

import com.pyteam.db.entity.AuctionPart;
import com.pyteam.db.mapper.AuctionMapper;
import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.mapper.Ad02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionService
{
    @Autowired
    private AuctionMapper auctionMapper;

    public List<AuctionPart> selectAd06LeftAd02(int aab101)
    {
        return auctionMapper.selectAd06LeftAd02(aab101);
    }
}
