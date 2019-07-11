package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.entity.Ad04Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ad04Mapper {
    long countByExample(Ad04Example example);

    int deleteByExample(Ad04Example example);

    int deleteByPrimaryKey(Integer aad401);

    int insert(Ad04 record);

    int insertSelective(Ad04 record);

    List<Ad04> selectByExample(Ad04Example example);

    Ad04 selectByPrimaryKey(Integer aad401);

    int updateByExampleSelective(@Param("record") Ad04 record, @Param("example") Ad04Example example);

    int updateByExample(@Param("record") Ad04 record, @Param("example") Ad04Example example);

    int updateByPrimaryKeySelective(Ad04 record);

    int updateByPrimaryKey(Ad04 record);
}