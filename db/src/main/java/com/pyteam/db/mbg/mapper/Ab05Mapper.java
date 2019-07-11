package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ab05;
import com.pyteam.db.mbg.entity.Ab05Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ab05Mapper {
    long countByExample(Ab05Example example);

    int deleteByExample(Ab05Example example);

    int deleteByPrimaryKey(Integer aab501);

    int insert(Ab05 record);

    int insertSelective(Ab05 record);

    List<Ab05> selectByExample(Ab05Example example);

    Ab05 selectByPrimaryKey(Integer aab501);

    int updateByExampleSelective(@Param("record") Ab05 record, @Param("example") Ab05Example example);

    int updateByExample(@Param("record") Ab05 record, @Param("example") Ab05Example example);

    int updateByPrimaryKeySelective(Ab05 record);

    int updateByPrimaryKey(Ab05 record);
}