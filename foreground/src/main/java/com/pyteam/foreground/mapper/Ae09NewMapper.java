package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ae09;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

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
}
