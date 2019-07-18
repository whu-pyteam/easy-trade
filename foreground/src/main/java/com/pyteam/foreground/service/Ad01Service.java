package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad01Example;
import com.pyteam.db.mbg.entity.Ad05;
import com.pyteam.db.mbg.mapper.Ad01Mapper;
import com.pyteam.foreground.controller.Ad01Controller;
import com.pyteam.foreground.dto.Ad01Dto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/8 11:01
 */

public  interface Ad01Service
{

    void add(Ad01 ad01);//增加悬赏
    void edit(Ad01 ad01);//修改悬赏
    void deleteById(int id);//依据流水号删除
    List<Ad01> listByAll();
    List <Ad01> moreQuery(String question);//模糊查询
    List<Ad01> notSure(String question);//不定查询
    List<Ad01> findById(int id);
    List<Ad01> selectById(int id);
    //更新人数
    Ad01 findbyaad101(int aad101);
    void editcount(Ad01 ad01);
    //查询买家列表
    List<Ad05>select(int id);
}

