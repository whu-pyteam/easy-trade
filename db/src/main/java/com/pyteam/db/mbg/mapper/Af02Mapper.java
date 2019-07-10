package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af02;
import com.pyteam.db.mbg.entity.Af02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Af02Mapper {
    long countByExample(Af02Example example);

    int deleteByExample(Af02Example example);

    int deleteByPrimaryKey(Integer aaf201);

    int insert(Af02 record);

    int insertSelective(Af02 record);

    List<Af02> selectByExample(Af02Example example);

    Af02 selectByPrimaryKey(Integer aaf201);

    int updateByExampleSelective(@Param("record") Af02 record, @Param("example") Af02Example example);

    int updateByExample(@Param("record") Af02 record, @Param("example") Af02Example example);

    int updateByPrimaryKeySelective(Af02 record);

    int updateByPrimaryKey(Af02 record);
}
