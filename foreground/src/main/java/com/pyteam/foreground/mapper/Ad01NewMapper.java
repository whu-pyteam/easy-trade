package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ad01;


import com.pyteam.db.mbg.mapper.Ad01Mapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/11 10:23
 */
@Repository
@Mapper
public interface Ad01NewMapper
{
    @Select("select aad101,aab101,aad103,aad104,aad105,aad106,aad107,aad108 from ad01 where aad105 like CONCAT('%',#{question},'%')and aad102=1")
     List<Ad01> moreQuery(String question);

    @Select("select aad101,aab101,aad103,aad104,aad105,aad106,aad107,aad108 from ad01 where aad102=1")
     List<Ad01> listByAll();

    @Select("select aad101,aab101,aad103,aad104,aad105,aad106,aad107,aad108 from ad01 where ad01.aad105 like CONCAT('%',#{question},'%') and ad01.aad102=1 union select aad101,aab101,aad103,aad104,aad105,aad106,aad107,aad108 from ad01 where ad01.aad103 like CONCAT('%',#{context},'%') and ad01.aad102=1")
     List<Ad01> notSure(String question,String context);

    @Insert("insert into ad01 (aab101,aad102,aad103,aad104,aad105,aad106,aad107,aad108) VALUES  " +
            "(#{aab101},0,#{aad103},#{aad104},#{aad105},0,#{aad107},#{aad108})")
     void addad01(Ad01 ad01);

    @Select("select  aad101,aab101,aad103,aad104,aad105,aad106,aad107,aad108 from ad01 where aad102=1 and aab101=#{id}")
    List<Ad01>findById(int id);

    @Update("update ad01 set aad103=#{aad103},aad104=#{aad104},aad105=#{aad105},aad108=#{aad108},aad107=#{aad107} where aad101=#{aad101} ")
    void updatenn(Ad01 ad01);

    @Select("select aad101,aab101,aad103,aad104,aad105,aad106,aad107,aad108 from ad01 where aad102=1 and aad101=#{aad101}")
    List<Ad01> findByPrimaryKey(int id);


    //更新人数

    @Update("update ad01 set aad106=#{aad106} where aad101=#{aad101}")
    void updateaad106(Ad01 ad01);

    //用户的创建单数

    @Select("select count(aad101) from ad01 where aab101=#{aab101}")
    int count (int aab101);

    //单号集合

    @Select("select aad101 from ad01 where aab101=#{aab101}")
    List<Ad01> order(int aab101);
}
