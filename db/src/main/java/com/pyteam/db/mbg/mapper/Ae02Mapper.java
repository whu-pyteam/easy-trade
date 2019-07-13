package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ae02;
import com.pyteam.db.mbg.entity.Ae02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Ae02Mapper {
    long countByExample(Ae02Example example);

    int deleteByExample(Ae02Example example);

    int deleteByPrimaryKey(Integer aae201);

    int insert(Ae02 record);

    int insertSelective(Ae02 record);

    List<Ae02> selectByExample(Ae02Example example);

    Ae02 selectByPrimaryKey(Integer aae201);

    int updateByExampleSelective(@Param("record") Ae02 record, @Param("example") Ae02Example example);

    int updateByExample(@Param("record") Ae02 record, @Param("example") Ae02Example example);

    int updateByPrimaryKeySelective(Ae02 record);

    int updateByPrimaryKey(Ae02 record);
}