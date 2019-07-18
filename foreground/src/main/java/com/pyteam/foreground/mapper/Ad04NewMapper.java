package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad02;

import com.pyteam.db.mbg.entity.Ad04;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 9:20
 */
@Repository
@Mapper
public interface Ad04NewMapper
{
    //悬赏收藏
    @Insert("insert into ad04(aab101,aad402) values (#{aab101},1)")

     void addad01(Ad01 ad01);

    //根据用户id反应收藏流水号

    @Select("select aad401 from ad04 where aab101=#{aab101} and aad402=1")
    List<Ad04> findById(Ad04 ad04);


}
