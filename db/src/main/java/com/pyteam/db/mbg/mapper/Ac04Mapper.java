package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ac04;
import com.pyteam.db.mbg.entity.Ac04Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ac04Mapper {
    long countByExample(Ac04Example example);

    int deleteByExample(Ac04Example example);

    int deleteByPrimaryKey(Integer aac401);

    int insert(Ac04 record);

    int insertSelective(Ac04 record);

    List<Ac04> selectByExample(Ac04Example example);

    Ac04 selectByPrimaryKey(Integer aac401);

    int updateByExampleSelective(@Param("record") Ac04 record, @Param("example") Ac04Example example);

    int updateByExample(@Param("record") Ac04 record, @Param("example") Ac04Example example);

    int updateByPrimaryKeySelective(Ac04 record);

    int updateByPrimaryKey(Ac04 record);
}