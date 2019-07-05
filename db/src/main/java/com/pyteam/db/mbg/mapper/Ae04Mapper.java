package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae04;
import com.pyteam.db.mbg.entity.Ae04Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ae04Mapper {
    int countByExample(Ae04Example example);

    int deleteByExample(Ae04Example example);

    int deleteByPrimaryKey(Integer aae401);

    int insert(Ae04 record);

    int insertSelective(Ae04 record);

    List<Ae04> selectByExample(Ae04Example example);

    Ae04 selectByPrimaryKey(Integer aae401);

    int updateByExampleSelective(@Param("record") Ae04 record, @Param("example") Ae04Example example);

    int updateByExample(@Param("record") Ae04 record, @Param("example") Ae04Example example);

    int updateByPrimaryKeySelective(Ae04 record);

    int updateByPrimaryKey(Ae04 record);
}