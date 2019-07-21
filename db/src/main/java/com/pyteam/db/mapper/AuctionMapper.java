package com.pyteam.db.mapper;

import com.pyteam.db.entity.AuctionConn;
import com.pyteam.db.entity.AuctionPart;
import com.pyteam.db.mbg.entity.Ad02;
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
    List<AuctionConn> selectAd02LeftAe05(@Param("aad401") int aad401);

    @Select("select d.aad201,d.aab101,d.aac201,d.aad202,d.aad203," +
            "       d.aad204,d.aad205,d.aad206,d.aad207,d.aad208," +
            "       d.aad209, d.aad210, d.aad211, d.aad212\n" +
            "       from ad02 d \n" +
            "       right join ae05 e \n" +
            "       on d.aad201 = e.aad201 and e.aad401 = #{aad401}\n" +
            "       where d.aad209='1' or d.aad209='3'")
    List<Ad02> selectAd02RightAe05(@Param("aad401") int aad401);

    @Select("select m.aad201, m.aad202, m.aad203, m.aad205, m.aad206, m.aad208,\n" +
            "    n.aad601, n.aad602, n.aad603\n" +
            "    from ad06 n\n" +
            "    left join ad02 m\n" +
            "    on m.aad201 = n.aad201\n" +
            "    where n.aab101 = #{aab101} and n.aad603 != '6'")
    List<AuctionPart> selectAd06LeftAd02(@Param("aab101") int aab101);

}
