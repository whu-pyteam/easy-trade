package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae09;
import com.pyteam.db.mbg.entity.Ae09Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ae09Mapper {
    int countByExample(Ae09Example example);

    int deleteByExample(Ae09Example example);

    int deleteByPrimaryKey(Integer aae901);

    int insert(Ae09 record);

    int insertSelective(Ae09 record);

    List<Ae09> selectByExample(Ae09Example example);

    Ae09 selectByPrimaryKey(Integer aae901);

    int updateByExampleSelective(@Param("record") Ae09 record, @Param("example") Ae09Example example);

    int updateByExample(@Param("record") Ae09 record, @Param("example") Ae09Example example);

    int updateByPrimaryKeySelective(Ae09 record);

    int updateByPrimaryKey(Ae09 record);
}