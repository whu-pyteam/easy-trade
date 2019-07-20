package com.pyteam.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.pyteam.background.dto.RewardQueryParam;
import com.pyteam.background.service.RewardService;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad01Example;
import com.pyteam.db.mbg.mapper.Ad01Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/13 14:14
 */
@Service
public class RewardServiceImpl implements RewardService
{
    @Autowired
    Ad01Mapper ad01Mapper;

    @Override
    public List<Ad01> list(RewardQueryParam queryParam)
    {
        PageHelper.startPage(queryParam.getPageNum(), queryParam.getPageSize());
        Ad01Example ad01Example = new Ad01Example();
        Ad01Example.Criteria criteria = ad01Example.createCriteria();
        if(!StringUtils.isEmpty(queryParam.getAad102()))
        {
            criteria.andAad102Like(queryParam.getAad102());
        }
        if(!StringUtils.isEmpty(queryParam.getAad105()))
        {
            criteria.andAad105EqualTo(queryParam.getAad105());
        }

        return ad01Mapper.selectByExample(ad01Example);
    }

    @Override
    public Ad01 getAd01ByAad101(Integer id)
    {
        return ad01Mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateAd01Status(Integer id, String status)
    {
        Ad01 ad01 = new Ad01();
        ad01.setAad101(id);
        ad01.setAad102(status);
        int i = ad01Mapper.updateByPrimaryKeySelective(ad01);
        return i != 0;
    }


}
