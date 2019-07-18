package com.pyteam.db.mapper;

import com.pyteam.db.entity.AuctionConn;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuctionMapper
{
    @Select("select d.aad201,d.aab101,d.aac201,d.aad202,d.aad203,\n" +
            "       d.aad204,d.aad205,d.aad207,d.aad208,d.aad211,\n" +
            "       d.aad212,e.aae501 \n" +
            "       from ad02 d \n" +
            "       left join ae05 e \n" +
            "       on d.aad201 = e.aad201 and e.aad401 = #{aad401}\n" +
            "       where d.aad209='1'")
    List<AuctionConn> selectAd02AndAe05(@Param("aad401") int aad401);
}
