package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.entity.Ab01Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Ab01Mapper {
    int countByExample(Ab01Example example);

    int deleteByExample(Ab01Example example);

    int deleteByPrimaryKey(Integer aab101);

    int insert(Ab01 record);

    int insertSelective(Ab01 record);

    List<Ab01> selectByExample(Ab01Example example);

    Ab01 selectByPrimaryKey(Integer aab101);

    int updateByExampleSelective(@Param("record") Ab01 record, @Param("example") Ab01Example example);

    int updateByExample(@Param("record") Ab01 record, @Param("example") Ab01Example example);

    int updateByPrimaryKeySelective(Ab01 record);

    int updateByPrimaryKey(Ab01 record);
}