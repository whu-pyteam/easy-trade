package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae07;
import com.pyteam.db.mbg.entity.Ae07Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ae07Mapper {
    int countByExample(Ae07Example example);

    int deleteByExample(Ae07Example example);

    int deleteByPrimaryKey(Integer aae701);

    int insert(Ae07 record);

    int insertSelective(Ae07 record);

    List<Ae07> selectByExample(Ae07Example example);

    Ae07 selectByPrimaryKey(Integer aae701);

    int updateByExampleSelective(@Param("record") Ae07 record, @Param("example") Ae07Example example);

    int updateByExample(@Param("record") Ae07 record, @Param("example") Ae07Example example);

    int updateByPrimaryKeySelective(Ae07 record);

    int updateByPrimaryKey(Ae07 record);
}