package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af04;
import com.pyteam.db.mbg.entity.Af04Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Af04Mapper {
    long countByExample(Af04Example example);

    int deleteByExample(Af04Example example);

    int deleteByPrimaryKey(Integer aaf401);

    int insert(Af04 record);

    int insertSelective(Af04 record);

    List<Af04> selectByExample(Af04Example example);

    Af04 selectByPrimaryKey(Integer aaf401);

    int updateByExampleSelective(@Param("record") Af04 record, @Param("example") Af04Example example);

    int updateByExample(@Param("record") Af04 record, @Param("example") Af04Example example);

    int updateByPrimaryKeySelective(Af04 record);

    int updateByPrimaryKey(Af04 record);
}