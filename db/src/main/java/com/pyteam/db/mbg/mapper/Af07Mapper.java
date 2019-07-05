package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af07;
import com.pyteam.db.mbg.entity.Af07Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Af07Mapper {
    int countByExample(Af07Example example);

    int deleteByExample(Af07Example example);

    int deleteByPrimaryKey(Integer aaf701);

    int insert(Af07 record);

    int insertSelective(Af07 record);

    List<Af07> selectByExample(Af07Example example);

    Af07 selectByPrimaryKey(Integer aaf701);

    int updateByExampleSelective(@Param("record") Af07 record, @Param("example") Af07Example example);

    int updateByExample(@Param("record") Af07 record, @Param("example") Af07Example example);

    int updateByPrimaryKeySelective(Af07 record);

    int updateByPrimaryKey(Af07 record);
}