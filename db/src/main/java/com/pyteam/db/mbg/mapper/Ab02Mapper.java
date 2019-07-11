package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ab02;
import com.pyteam.db.mbg.entity.Ab02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ab02Mapper {
    long countByExample(Ab02Example example);

    int deleteByExample(Ab02Example example);

    int deleteByPrimaryKey(Integer aab201);

    int insert(Ab02 record);

    int insertSelective(Ab02 record);

    List<Ab02> selectByExample(Ab02Example example);

    Ab02 selectByPrimaryKey(Integer aab201);

    int updateByExampleSelective(@Param("record") Ab02 record, @Param("example") Ab02Example example);

    int updateByExample(@Param("record") Ab02 record, @Param("example") Ab02Example example);

    int updateByPrimaryKeySelective(Ab02 record);

    int updateByPrimaryKey(Ab02 record);
}