package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ac05;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.beans.Transient;

/**
 * @author wjm
 * @date2019/7/15 15:46
 */
@Repository
@Mapper
public interface Ac05NewMapper
{
    //插入订单,默认情况是未发货


    @Insert("insert into ac05(aab101,aac502,aac503,aac504,aac505,aac506,aac507,aac508,aac509,aac510,aac511) values" +
            "(#{aab101},#{aac502},0,#{aac504},#{aac505},#{aac506},#{aac507},#{aac508},#{aac509},#{aac510},#{aac511})")
    void insertAc05(Ac05 ac05);


    //查询 单号出现次数

    @Select("select count(aac501) from ac05 where aac502=#{aac502}")
    int count(String aac502);
}
