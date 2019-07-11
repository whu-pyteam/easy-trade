package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ac05Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ac05Mapper {
    long countByExample(Ac05Example example);

    int deleteByExample(Ac05Example example);

    int deleteByPrimaryKey(Integer aac501);

    int insert(Ac05 record);

    int insertSelective(Ac05 record);

    List<Ac05> selectByExample(Ac05Example example);

    Ac05 selectByPrimaryKey(Integer aac501);

    int updateByExampleSelective(@Param("record") Ac05 record, @Param("example") Ac05Example example);

    int updateByExample(@Param("record") Ac05 record, @Param("example") Ac05Example example);

    int updateByPrimaryKeySelective(Ac05 record);

    int updateByPrimaryKey(Ac05 record);
}