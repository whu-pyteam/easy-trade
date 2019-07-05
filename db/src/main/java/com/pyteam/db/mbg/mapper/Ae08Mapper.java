package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae08;
import com.pyteam.db.mbg.entity.Ae08Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ae08Mapper {
    int countByExample(Ae08Example example);

    int deleteByExample(Ae08Example example);

    int deleteByPrimaryKey(Integer aae801);

    int insert(Ae08 record);

    int insertSelective(Ae08 record);

    List<Ae08> selectByExample(Ae08Example example);

    Ae08 selectByPrimaryKey(Integer aae801);

    int updateByExampleSelective(@Param("record") Ae08 record, @Param("example") Ae08Example example);

    int updateByExample(@Param("record") Ae08 record, @Param("example") Ae08Example example);

    int updateByPrimaryKeySelective(Ae08 record);

    int updateByPrimaryKey(Ae08 record);
}