package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ac05;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

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


    //    根据订单号确定流水号

    @Select("select aac501 from ac05 where aac502=#{aac502} ")
    int query(String aac502);


    //订单号查询整个信息

    @Select("select aac501,aab101,aac502,aac503,aac504,aac505,aac506,aac507,aac508,aac509,aac510,aac511 from ac05 where aac501=#{aac501}")
    List<Ac05> ac05List(int aac501);

    //更改信息

    @Update("update ac05 set aac504=#{aac504},aac505=#{aac505},aac506=#{aac506},aac507=#{aac507},aac509=#{aac509},aac510=#{aac510} where aac502=#{aac502}")
    void update (Ac05 ac05);

    @Delete("delete from ac05 where aac501=#{aac501}")
    void deletebyaac501(Ac05 ac05);


    //根据接收方查询

    @Select("select aac501,aab101,aac502,aac503,aac504,aac505,aac506,aac507,aac508,aac509,aac510,aac511 from ac05 where aab101=#{aab101}")
    List<Ac05> queryByAab101(int aab101);

    @Update("update ac05 set aac503=1 where aac502=#{aac502}")
    void updatenn(String aac502);

    @Update("update ac05 set aac503=2 where aac502=#{aac502}")
    void updatecc(String aac502);

    @Select("select aab101 from ac05 where aac502=#{aac502}")
    int aab101(String aac502);

    @Select("select aac503 from ac05 where aac502=#{aac502}")
    int aac503(String aac502);
}
