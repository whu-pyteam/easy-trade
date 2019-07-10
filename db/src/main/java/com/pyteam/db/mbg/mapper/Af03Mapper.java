package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af03;
import com.pyteam.db.mbg.entity.Af03Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Af03Mapper {
    long countByExample(Af03Example example);

    int deleteByExample(Af03Example example);

    int deleteByPrimaryKey(Integer aaf301);

    int insert(Af03 record);

    int insertSelective(Af03 record);

    List<Af03> selectByExample(Af03Example example);

    Af03 selectByPrimaryKey(Integer aaf301);

    int updateByExampleSelective(@Param("record") Af03 record, @Param("example") Af03Example example);

    int updateByExample(@Param("record") Af03 record, @Param("example") Af03Example example);

    int updateByPrimaryKeySelective(Af03 record);

    int updateByPrimaryKey(Af03 record);
}