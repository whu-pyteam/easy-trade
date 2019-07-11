package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ab04;
import com.pyteam.db.mbg.entity.Ab04Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Ab04Mapper {
    long countByExample(Ab04Example example);

    int deleteByExample(Ab04Example example);

    int deleteByPrimaryKey(Integer aab401);

    int insert(Ab04 record);

    int insertSelective(Ab04 record);

    List<Ab04> selectByExample(Ab04Example example);

    Ab04 selectByPrimaryKey(Integer aab401);

    int updateByExampleSelective(@Param("record") Ab04 record, @Param("example") Ab04Example example);

    int updateByExample(@Param("record") Ab04 record, @Param("example") Ab04Example example);

    int updateByPrimaryKeySelective(Ab04 record);

    int updateByPrimaryKey(Ab04 record);
}