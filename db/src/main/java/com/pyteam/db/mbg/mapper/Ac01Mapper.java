package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.db.mbg.entity.Ac01Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ac01Mapper {
    long countByExample(Ac01Example example);

    int deleteByExample(Ac01Example example);

    int deleteByPrimaryKey(Integer aac101);

    int insert(Ac01 record);

    int insertSelective(Ac01 record);

    List<Ac01> selectByExample(Ac01Example example);

    Ac01 selectByPrimaryKey(Integer aac101);

    int updateByExampleSelective(@Param("record") Ac01 record, @Param("example") Ac01Example example);

    int updateByExample(@Param("record") Ac01 record, @Param("example") Ac01Example example);

    int updateByPrimaryKeySelective(Ac01 record);

    int updateByPrimaryKey(Ac01 record);
}