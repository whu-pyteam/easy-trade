package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ae09;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/15 15:20
 */
@Mapper
@Repository
public interface Ae09NewMapper
{
    @Insert("insert into ae09(aad101,aac201) values(#{aad101},#{aac201})")
    void insert(Ae09 ae09);

    @Update("update ae09 set aac201=#{aac201} where aae901=#{aae901}")
    void update(Ae09 ae09);

    @Select("select count(aae901) from ae09 where aad101=#{aad101} and aac201=#{aac201}")
    int countThis(Ae09 ae09);

    @Select("select count(aae901) from ae09 where aad101=#{aad101}")
    int countAe09(int aad101);

    @Select("select count(aae901) from ae09 where aac201=#{aac201}")

    int countaae901(int aac201);

    @Select("select aae901,aac201 from ae09 where aad101=#{aad101}")
    List<Ae09> select(int aad101);

    @Select("delete from ae09 where aac201=#{aac201} and aad101=#{aad101}")
    void delete (Ae09 ae09);

    @Select("select aae901,aad101 from ae09 where aac201=#{aac201}")
    List<Ae09> selectaad101(int aac201);
}
