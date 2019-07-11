package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ad06;
import com.pyteam.db.mbg.entity.Ad06Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ad06Mapper {
    long countByExample(Ad06Example example);

    int deleteByExample(Ad06Example example);

    int deleteByPrimaryKey(Integer aad601);

    int insert(Ad06 record);

    int insertSelective(Ad06 record);

    List<Ad06> selectByExample(Ad06Example example);

    Ad06 selectByPrimaryKey(Integer aad601);

    int updateByExampleSelective(@Param("record") Ad06 record, @Param("example") Ad06Example example);

    int updateByExample(@Param("record") Ad06 record, @Param("example") Ad06Example example);

    int updateByPrimaryKeySelective(Ad06 record);

    int updateByPrimaryKey(Ad06 record);
}