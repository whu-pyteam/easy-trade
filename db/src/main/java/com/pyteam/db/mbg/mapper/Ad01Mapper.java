package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad01Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ad01Mapper {
    long countByExample(Ad01Example example);

    int deleteByExample(Ad01Example example);

    int deleteByPrimaryKey(Integer aad101);

    int insert(Ad01 record);

    int insertSelective(Ad01 record);

    List<Ad01> selectByExample(Ad01Example example);

    Ad01 selectByPrimaryKey(Integer aad101);

    int updateByExampleSelective(@Param("record") Ad01 record, @Param("example") Ad01Example example);

    int updateByExample(@Param("record") Ad01 record, @Param("example") Ad01Example example);

    int updateByPrimaryKeySelective(Ad01 record);

    int updateByPrimaryKey(Ad01 record);
}