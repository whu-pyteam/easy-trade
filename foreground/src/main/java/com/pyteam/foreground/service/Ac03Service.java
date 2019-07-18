package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac03;
import com.pyteam.db.mbg.entity.Ac03Example;
import com.pyteam.db.mbg.mapper.Ac03Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ac03Service
{
    @Autowired
    private Ac03Mapper ac03Mapper;

    /**
     * 根据用户id获取购物车id
     * @param id
     * @return
     * @throws Exception
     */
    public Integer getCartIdByUserId(Integer id)throws Exception
    {
        Ac03Example ac03Example = new Ac03Example();
        Ac03Example.Criteria criteria = ac03Example.createCriteria();
        criteria.andAab101EqualTo(id);
        List<Ac03> ac03List=ac03Mapper.selectByExample(ac03Example);
        if(ac03List.size() == 1)
        {
            return ac03List.get(0).getAac301();
        }
        else
        {
            return null;
        }
    }
}
