package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ad02Mapper {
    int countByExample(Ad02Example example);

    int deleteByExample(Ad02Example example);

    int deleteByPrimaryKey(Integer aad201);

    int insert(Ad02 record);

    int insertSelective(Ad02 record);

    List<Ad02> selectByExample(Ad02Example example);

    Ad02 selectByPrimaryKey(Integer aad201);

    int updateByExampleSelective(@Param("record") Ad02 record, @Param("example") Ad02Example example);

    int updateByExample(@Param("record") Ad02 record, @Param("example") Ad02Example example);

    int updateByPrimaryKeySelective(Ad02 record);

    int updateByPrimaryKey(Ad02 record);
}