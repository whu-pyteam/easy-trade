package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ad03;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/20 10:34
 */
@Mapper
@Repository
public interface Ad03NewMapper
{
    @Insert("insert into ad03(aab101,aad302,aad303,aad304) values(#{aab101},2,#{aad303},#{aad304})")
    void ins(Ad03 ad03);

    @Select("select aad301,aad302,aad303,aad304,aab101  from ad03 where aab101=#{aab101} and aad302=2")
    List<Ad03> query(int aab101);

    @Select("select count(aad301) from ad03 where aab101=#{aab101} and aad302=2")
    int count (int aab101);

    @Update("update ad03 set  aad303=#{aad303},aad304=#{aad304} where aad301=#{aad301}")
    void update(Ad03 ad03);

    @Delete("delete from ad03 where aad301=#{aad301}")
    void delAd03(int aad301);
}
