package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae01;
import com.pyteam.db.mbg.entity.Ae01Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ae01Mapper {
    int countByExample(Ae01Example example);

    int deleteByExample(Ae01Example example);

    int deleteByPrimaryKey(Integer aae101);

    int insert(Ae01 record);

    int insertSelective(Ae01 record);

    List<Ae01> selectByExample(Ae01Example example);

    Ae01 selectByPrimaryKey(Integer aae101);

    int updateByExampleSelective(@Param("record") Ae01 record, @Param("example") Ae01Example example);

    int updateByExample(@Param("record") Ae01 record, @Param("example") Ae01Example example);

    int updateByPrimaryKeySelective(Ae01 record);

    int updateByPrimaryKey(Ae01 record);
}