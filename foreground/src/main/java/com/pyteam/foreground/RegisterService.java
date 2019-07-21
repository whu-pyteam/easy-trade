package com.pyteam.foreground;

import com.pyteam.db.mbg.entity.*;
import com.pyteam.db.mbg.mapper.Ab01Mapper;
import com.pyteam.db.mbg.mapper.Ab02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author tyc
 * @date 2019/7/19 8:51
 */
@Service
public class RegisterService
{
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    Ab01Mapper ab01Mapper;
    @Autowired
    Ab02Mapper ab02Mapper;

    /**
     * 注册
     * @param
     * @return
     */
    public boolean register(String username, String password, String number)
    {
        Ab01 ab01 = new Ab01();
        ab01.setAab102(username);
        ab01.setAab108(password);
        ab01.setAab112(number);
        ab01.setAab110("0");
        ab01.setAab113(new Date());
        ab01.setAab114(new Date());

        //查询是否有相同用户名的用户
        Ab01Example example = new Ab01Example();
        example.createCriteria().andAab102EqualTo(ab01.getAab102());
        List<Ab01> userList = ab01Mapper.selectByExample(example);
        if(userList.size() > 0)
        {
            return false;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(password);
        ab01.setAab108(encodePassword);
        ab01Mapper.insert(ab01);
        return true;
    }

    public boolean isNumberFree(String number)
    {
        //查询手机号是否被使用
        Ab01Example example = new Ab01Example();
        example.createCriteria().andAab112EqualTo(number);
        List<Ab01> result = ab01Mapper.selectByExample(example);
        return result.size() <= 0;
    }

    public boolean isNameFree(String name)
    {
        ////查询用户账号名称是否被使用
        Ab01Example example = new Ab01Example();
        example.createCriteria().andAab102EqualTo(name);
        List<Ab01> result = ab01Mapper.selectByExample(example);
        return result.size() == 0;
    }


    public boolean insertCode(String number, String code)
    {
        Ab02 ab02 = new Ab02();
        ab02.setAab203(new Date());
        ab02.setAab202(code);

        Ab02Example example = new Ab02Example();
            ab02.setAab204(number);
        example.createCriteria().andAab204EqualTo(number);
        // 如果有记录
        List<Ab02> ab02s = ab02Mapper.selectByExample(example);
        int i;
        if(ab02s.size() != 0)
        {
            Integer aab201 = ab02s.get(0).getAab201();
            ab02.setAab201(aab201);
            i = ab02Mapper.updateByPrimaryKey(ab02);
        }
        else
        {
            i = ab02Mapper.insert(ab02);
        }
        return i==1;
    }

    public boolean validCode(String number, String code)
    {
        Ab02Example example = new Ab02Example();
        example.createCriteria().andAab204EqualTo(number).andAab202EqualTo(code);
        List<Ab02> ab02s = ab02Mapper.selectByExample(example);
        return ab02s.size() == 1;
    }
}
