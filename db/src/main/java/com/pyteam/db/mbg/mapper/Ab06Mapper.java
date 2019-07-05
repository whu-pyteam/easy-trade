package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ab06;
import com.pyteam.db.mbg.entity.Ab06Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ab06Mapper {
    int countByExample(Ab06Example example);

    int deleteByExample(Ab06Example example);

    int deleteByPrimaryKey(Integer aab601);

    int insert(Ab06 record);

    int insertSelective(Ab06 record);

    List<Ab06> selectByExample(Ab06Example example);

    Ab06 selectByPrimaryKey(Integer aab601);

    int updateByExampleSelective(@Param("record") Ab06 record, @Param("example") Ab06Example example);

    int updateByExample(@Param("record") Ab06 record, @Param("example") Ab06Example example);

    int updateByPrimaryKeySelective(Ab06 record);

    int updateByPrimaryKey(Ab06 record);
}