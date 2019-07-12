package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ab03;
import com.pyteam.db.mbg.entity.Ab03Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Ab03Mapper {
    long countByExample(Ab03Example example);

    int deleteByExample(Ab03Example example);

    int deleteByPrimaryKey(Integer aab301);

    int insert(Ab03 record);

    int insertSelective(Ab03 record);

    List<Ab03> selectByExample(Ab03Example example);

    Ab03 selectByPrimaryKey(Integer aab301);

    int updateByExampleSelective(@Param("record") Ab03 record, @Param("example") Ab03Example example);

    int updateByExample(@Param("record") Ab03 record, @Param("example") Ab03Example example);

    int updateByPrimaryKeySelective(Ab03 record);

    int updateByPrimaryKey(Ab03 record);
}