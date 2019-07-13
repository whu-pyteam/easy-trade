package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af09;
import com.pyteam.db.mbg.entity.Af09Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Af09Mapper {
    long countByExample(Af09Example example);

    int deleteByExample(Af09Example example);

    int deleteByPrimaryKey(Integer aaf901);

    int insert(Af09 record);

    int insertSelective(Af09 record);

    List<Af09> selectByExample(Af09Example example);

    Af09 selectByPrimaryKey(Integer aaf901);

    int updateByExampleSelective(@Param("record") Af09 record, @Param("example") Af09Example example);

    int updateByExample(@Param("record") Af09 record, @Param("example") Af09Example example);

    int updateByPrimaryKeySelective(Af09 record);

    int updateByPrimaryKey(Af09 record);
}