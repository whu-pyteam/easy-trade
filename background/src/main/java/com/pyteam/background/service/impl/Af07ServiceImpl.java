package com.pyteam.background.service.impl;

import com.pyteam.background.dto.StaffRoleParam;
import com.pyteam.background.service.Af07Service;
import com.pyteam.db.mbg.entity.Af07;
import com.pyteam.db.mbg.entity.Af07Example;
import com.pyteam.db.mbg.mapper.Af07Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/11 10:27
 */
@Service
public class Af07ServiceImpl implements Af07Service
{

    @Autowired
    Af07Mapper af07Mapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean staffRoleRelation(StaffRoleParam staffRoleParam)
    {
        // 查询 af07 员工已关联的角色
        Af07Example af07Example = new Af07Example();
        Af07Example.Criteria criteria = af07Example.createCriteria();
        criteria.andAaf201EqualTo(staffRoleParam.getAaf201());
        List<Af07> af07List = af07Mapper.selectByExample(af07Example);
        System.out.println(af07List);
        for(Af07 af07 : af07List)
        {
            Af07Example af07Example1 = new Af07Example();
            Af07Example.Criteria criteria1 = af07Example1.createCriteria();
            criteria1.andAaf601EqualTo(af07.getAaf601());
            af07Mapper.deleteByExample(af07Example1);
        }

        // 需要更新关联的角色列表
        List<Integer> aaf601List = staffRoleParam.getAaf601List();

        for(Integer aaf601 : aaf601List)
        {
            Af07 newAf07 = new Af07();
            newAf07.setAaf601(aaf601);
            newAf07.setAaf201(staffRoleParam.getAaf201());
            if(af07Mapper.insert(newAf07) != 1)
            {

                return false;
            }
        }
        return true;
    }
}
