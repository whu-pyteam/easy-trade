package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae03;
import com.pyteam.db.mbg.entity.Ae03Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ae03Mapper {
    int countByExample(Ae03Example example);

    int deleteByExample(Ae03Example example);

    int deleteByPrimaryKey(Integer aae301);

    int insert(Ae03 record);

    int insertSelective(Ae03 record);

    List<Ae03> selectByExample(Ae03Example example);

    Ae03 selectByPrimaryKey(Integer aae301);

    int updateByExampleSelective(@Param("record") Ae03 record, @Param("example") Ae03Example example);

    int updateByExample(@Param("record") Ae03 record, @Param("example") Ae03Example example);

    int updateByPrimaryKeySelective(Ae03 record);

    int updateByPrimaryKey(Ae03 record);
}