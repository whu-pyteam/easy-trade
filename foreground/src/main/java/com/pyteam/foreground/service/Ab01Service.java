package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.entity.Ab01Example;
import com.pyteam.db.mbg.entity.Syscode;
import com.pyteam.db.mbg.entity.SyscodeExample;
import com.pyteam.db.mbg.mapper.Ab01Mapper;
import com.pyteam.db.mbg.mapper.SyscodeMapper;
import com.pyteam.db.utils.QiniuUtil;
import com.pyteam.foreground.dto.Ab01Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import java.util.List;

/**
 * 用户表ab01
 */
@Service
public class Ab01Service
{

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    private Ab01Mapper ab01Mapper;
    @Autowired
    private SyscodeMapper syscodeMapper;
    @Autowired
    private QiniuUtil qiniuUtil;

    public boolean addAb01() throws Exception
    {
        Ab01 ab01 = new Ab01();
        ab01.setAab102("会员001");
        ab01.setAab103("小明");
        ab01.setAab104("1");  //0-未知，1-男，2-女
        ab01.setAab105(new SimpleDateFormat("yyyy-MM-dd").parse("1998-08-30"));
        ab01.setAab106(new Integer(1234));
        ab01.setAab107("url");
        ab01.setAab108("123456");
        ab01.setAab109(new Integer(0));
        ab01.setAab110("0");
        ab01.setAab111("");
        ab01.setAab112("158xxxx");
        ab01.setAab113(new Date());
        ab01.setAab114(new Date());
        Integer res = ab01Mapper.insert(ab01);
        return res.intValue() > 0;
    }

    public boolean isMember(String username, String password) throws Exception
    {
        Ab01 ab01 = this.getMemberByUsername(username);
        if (ab01 == null)
        {
            /**
             * 用户不存在
             */
            return false;
        }
        if (passwordEncoder.matches(password, ab01.getAab108()))
        {
            /**
             * 用户名密码匹配
             */
            return true;
        }
        else
        {
            /**
             * 用户名不匹配密码
             */
            return false;
        }
    }

    public Ab01 getMemberInfo(Integer aab101)throws Exception
    {
        return ab01Mapper.selectByPrimaryKey(aab101);
    }

    public Ab01 getMemberByUsername(String username)
    {
        Ab01Example example = new Ab01Example();
        Ab01Example.Criteria criteria = example.createCriteria();
        criteria.andAab102EqualTo(username);
        return ab01Mapper.selectByExample(example).get(0);
    }




    public boolean updateMemberInfo(Integer aab101,Ab01Dto ab01Dto)throws Exception
    {
        Ab01 ab01=new Ab01();
        ab01.setAab101(aab101);
        ab01.setAab103(ab01Dto.getAab103());
        ab01.setAab104(ab01Dto.getAab104());
        ab01.setAab105(new SimpleDateFormat("yyyy-MM-dd").parse(ab01Dto.getAab105()));

        /*
        SyscodeExample syscodeExample=new SyscodeExample();
        SyscodeExample.Criteria criteria=syscodeExample.createCriteria();
        criteria.andIdnameEqualTo(ab01Dto.getAab106());
        List<Syscode> syscodeList=syscodeMapper.selectByExample(syscodeExample);
        if(syscodeList.size()==1)
        {
            ab01.setAab106(syscodeList.get(0).getSyscodeid());
        }
        else
        {
            ab01.setAab106(1);
        }
        */
        ab01.setAab106(Integer.parseInt(ab01Dto.getAab106()));
        if(ab01Dto.getHasEdit().equals("0"))
        {
            ab01.setAab107(ab01Mapper.selectByPrimaryKey(aab101).getAab107());
        }
        else
        {
            ab01.setAab107(qiniuUtil.uploadImg(ab01Dto.getAab107()));
        }
        ab01.setAab111(ab01Dto.getAab111());

        ab01Mapper.updateByPrimaryKeySelective(ab01);
        return true;
    }
}
