package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.db.mbg.entity.Ac01Example;
import com.pyteam.db.mbg.mapper.Ac01Mapper;
import com.pyteam.foreground.dto.Ac01Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pyteam.db.utils.QiniuUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class Ac01Service
{
    @Autowired
    private Ac01Mapper ac01Mapper;

    @Autowired
    private QiniuUtil qiniuUtil;

    /**
     * 根据id获取商品
     * @param id
     * @return
     * @throws Exception
     */
    public Ac01 findById(int id) throws Exception
    {
        return ac01Mapper.selectByPrimaryKey(id);
    }

    /**
     * 获取商品列表
     * @return
     * @throws Exception
     */
    public List<Ac01> selectById() throws Exception
    {
        Ac01Example ac01Example=new Ac01Example();
        List<Ac01> ac01List = ac01Mapper.selectByExample(ac01Example);
        return ac01List;
    }


    public boolean addAc01(Ac01Dto ac01Dto)throws Exception
    {
        Ac01 ac01 = new Ac01();
        ac01.setAab101(1);
        ac01.setAac201(1);
        ac01.setAac102(ac01Dto.getAac102());
        ac01.setAac103(ac01Dto.getAac103());
        ac01.setAac104("0");
        ac01.setAac105(ac01Dto.getAac105());
        ac01.setAac106(qiniuUtil.uploadImg(ac01Dto.getAac106()));
        ac01.setAac107(new Date());

        System.out.println(ac01);
        int res = ac01Mapper.insert(ac01);
        System.out.println(res);
        return res > 0;
    }
}
