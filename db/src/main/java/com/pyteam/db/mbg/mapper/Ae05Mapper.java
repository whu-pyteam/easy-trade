package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae05;
import com.pyteam.db.mbg.entity.Ae05Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ae05Mapper {
    int countByExample(Ae05Example example);

    int deleteByExample(Ae05Example example);

    int deleteByPrimaryKey(Integer aae501);

    int insert(Ae05 record);

    int insertSelective(Ae05 record);

    List<Ae05> selectByExample(Ae05Example example);

    Ae05 selectByPrimaryKey(Integer aae501);

    int updateByExampleSelective(@Param("record") Ae05 record, @Param("example") Ae05Example example);

    int updateByExample(@Param("record") Ae05 record, @Param("example") Ae05Example example);

    int updateByPrimaryKeySelective(Ae05 record);

    int updateByPrimaryKey(Ae05 record);
}