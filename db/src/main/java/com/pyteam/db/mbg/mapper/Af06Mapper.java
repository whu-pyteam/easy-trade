package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af06;
import com.pyteam.db.mbg.entity.Af06Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Af06Mapper {
    long countByExample(Af06Example example);

    int deleteByExample(Af06Example example);

    int deleteByPrimaryKey(Integer aaf601);

    int insert(Af06 record);

    int insertSelective(Af06 record);

    List<Af06> selectByExample(Af06Example example);

    Af06 selectByPrimaryKey(Integer aaf601);

    int updateByExampleSelective(@Param("record") Af06 record, @Param("example") Af06Example example);

    int updateByExample(@Param("record") Af06 record, @Param("example") Af06Example example);

    int updateByPrimaryKeySelective(Af06 record);

    int updateByPrimaryKey(Af06 record);
}