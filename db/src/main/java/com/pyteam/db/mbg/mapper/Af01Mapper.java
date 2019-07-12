package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af01;
import com.pyteam.db.mbg.entity.Af01Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Af01Mapper {
    long countByExample(Af01Example example);

    int deleteByExample(Af01Example example);

    int deleteByPrimaryKey(Integer aaf101);

    int insert(Af01 record);

    int insertSelective(Af01 record);

    List<Af01> selectByExample(Af01Example example);

    Af01 selectByPrimaryKey(Integer aaf101);

    int updateByExampleSelective(@Param("record") Af01 record, @Param("example") Af01Example example);

    int updateByExample(@Param("record") Af01 record, @Param("example") Af01Example example);

    int updateByPrimaryKeySelective(Af01 record);

    int updateByPrimaryKey(Af01 record);
}