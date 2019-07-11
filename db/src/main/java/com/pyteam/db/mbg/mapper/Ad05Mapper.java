package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ad05;
import com.pyteam.db.mbg.entity.Ad05Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Ad05Mapper {
    long countByExample(Ad05Example example);

    int deleteByExample(Ad05Example example);

    int deleteByPrimaryKey(Integer aad501);

    int insert(Ad05 record);

    int insertSelective(Ad05 record);

    List<Ad05> selectByExample(Ad05Example example);

    Ad05 selectByPrimaryKey(Integer aad501);

    int updateByExampleSelective(@Param("record") Ad05 record, @Param("example") Ad05Example example);

    int updateByExample(@Param("record") Ad05 record, @Param("example") Ad05Example example);

    int updateByPrimaryKeySelective(Ad05 record);

    int updateByPrimaryKey(Ad05 record);
}