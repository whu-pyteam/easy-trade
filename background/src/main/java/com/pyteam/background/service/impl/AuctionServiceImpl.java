package com.pyteam.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.pyteam.background.dto.AuctionQueryParam;
import com.pyteam.background.service.AuctionService;
import com.pyteam.db.mbg.entity.Ad01Example;
import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad02Example;
import com.pyteam.db.mbg.mapper.Ad02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/15 9:02
 */
@Service
public class AuctionServiceImpl implements AuctionService
{

    private final Ad02Mapper ad02Mapper;

    public AuctionServiceImpl(Ad02Mapper ad02Mapper)
    {
        this.ad02Mapper = ad02Mapper;
    }


    @Override
    public List<Ad02> list(AuctionQueryParam queryParam)
    {
        PageHelper.startPage(queryParam.getPageNum(), queryParam.getPageSize());
        Ad02Example example = new Ad02Example();
        Ad02Example.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(queryParam.getAad202()))
        {
            criteria.andAad202Like("%" + queryParam.getAad202() + "%");
        }
        if(!StringUtils.isEmpty(queryParam.getAad209()))
        {
            criteria.andAad209EqualTo((queryParam.getAad209()));
        }

        return ad02Mapper.selectByExample(example);
    }

    @Override
    public boolean updateAuction(Integer aad201, String aad209)
    {
        Ad02 ad02 = new Ad02();
        ad02.setAad201(aad201);
        ad02.setAad209(aad209);
        int i = ad02Mapper.updateByPrimaryKeySelective(ad02);
        return i != 0;
    }

    @Override
    public Ad02 getAuctionByAad201(Integer aad201)
    {
        return ad02Mapper.selectByPrimaryKey(aad201);
    }
}
