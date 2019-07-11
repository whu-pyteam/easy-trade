package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af08;
import com.pyteam.db.mbg.entity.Af08Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Af08Mapper {
    long countByExample(Af08Example example);

    int deleteByExample(Af08Example example);

    int deleteByPrimaryKey(Integer aaf801);

    int insert(Af08 record);

    int insertSelective(Af08 record);

    List<Af08> selectByExample(Af08Example example);

    Af08 selectByPrimaryKey(Integer aaf801);

    int updateByExampleSelective(@Param("record") Af08 record, @Param("example") Af08Example example);

    int updateByExample(@Param("record") Af08 record, @Param("example") Af08Example example);

    int updateByPrimaryKeySelective(Af08 record);

    int updateByPrimaryKey(Af08 record);
}