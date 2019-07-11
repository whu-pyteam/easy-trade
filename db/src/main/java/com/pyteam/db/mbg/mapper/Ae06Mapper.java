package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae06;
import com.pyteam.db.mbg.entity.Ae06Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Ae06Mapper {
    long countByExample(Ae06Example example);

    int deleteByExample(Ae06Example example);

    int deleteByPrimaryKey(Integer aae601);

    int insert(Ae06 record);

    int insertSelective(Ae06 record);

    List<Ae06> selectByExample(Ae06Example example);

    Ae06 selectByPrimaryKey(Integer aae601);

    int updateByExampleSelective(@Param("record") Ae06 record, @Param("example") Ae06Example example);

    int updateByExample(@Param("record") Ae06 record, @Param("example") Ae06Example example);

    int updateByPrimaryKeySelective(Ae06 record);

    int updateByPrimaryKey(Ae06 record);
}