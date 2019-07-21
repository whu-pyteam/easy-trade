package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ac02Example;
import com.pyteam.db.mbg.mapper.Ac02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 分类标签表ac02
 */
@Service
public class Ac02Service
{
    @Autowired
    private Ac02Mapper ac02Mapper;

    public boolean addAc02() throws Exception
    {
        Ac02 ac02 = new Ac02();
        ac02.setAac202("手机");
        ac02.setAac203(0);
        return ac02Mapper.insert(ac02) > 0;
    }

    public String getName(Integer aac201)
    {
        return ac02Mapper.selectByPrimaryKey(aac201).getAac202();
    }


    /**
     * 根据商品分类父id获取所有子id
     * @param aac203
     * @return
     */
    public List<Integer> getChildIds(Integer aac203)
    {
        Ac02Example ac02Example=new Ac02Example();
        Ac02Example.Criteria criteria=ac02Example.createCriteria();
        criteria.andAac203EqualTo(aac203);
        List<Ac02> ac02List = ac02Mapper.selectByExample(ac02Example);

        List<Integer> integers=new ArrayList<>();
        for(Ac02 ac02 : ac02List)
        {
            integers.add(ac02.getAac201());
        }
        return integers;
    }

}
