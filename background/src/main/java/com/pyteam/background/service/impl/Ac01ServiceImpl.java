package com.pyteam.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.pyteam.background.dto.ProductQueryParam;
import com.pyteam.background.service.Ac01Service;
import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.db.mbg.entity.Ac01Example;
import com.pyteam.db.mbg.mapper.Ac01Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/12 11:19
 */
@Service
public class Ac01ServiceImpl implements Ac01Service
{
    @Autowired
    Ac01Mapper ac01Mapper;

    @Override
    public List<Ac01> getAc01List(ProductQueryParam queryParam)
    {
        PageHelper.startPage(queryParam.getPageNum(), queryParam.getPageSize());
        Ac01Example ac01Example = new Ac01Example();
        Ac01Example.Criteria criteria = ac01Example.createCriteria();

        if(!StringUtils.isEmpty(queryParam.getAac102()))
        {
            criteria.andAac102Like("%" + queryParam.getAac102() + "%");
        }
        if(!StringUtils.isEmpty(queryParam.getAac104()))
        {
            criteria.andAac104EqualTo(queryParam.getAac104());
        }

        return ac01Mapper.selectByExample(ac01Example);
    }

    @Override
    public Ac01 getAc01(Integer id)
    {
        return ac01Mapper.selectByPrimaryKey(id);
    }


    @Override
    public Boolean updateAc01(Integer id, String status)
    {
        Ac01 ac01 = new Ac01();
        ac01.setAac101(id);
        ac01.setAac104(status);
        return ac01Mapper.updateByPrimaryKeySelective(ac01) != 0;
    }
}
