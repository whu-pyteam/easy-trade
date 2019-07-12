package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ad03;
import com.pyteam.db.mbg.entity.Ad03Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Ad03Mapper {
    long countByExample(Ad03Example example);

    int deleteByExample(Ad03Example example);

    int deleteByPrimaryKey(Integer aad301);

    int insert(Ad03 record);

    int insertSelective(Ad03 record);

    List<Ad03> selectByExample(Ad03Example example);

    Ad03 selectByPrimaryKey(Integer aad301);

    int updateByExampleSelective(@Param("record") Ad03 record, @Param("example") Ad03Example example);

    int updateByExample(@Param("record") Ad03 record, @Param("example") Ad03Example example);

    int updateByPrimaryKeySelective(Ad03 record);

    int updateByPrimaryKey(Ad03 record);
}