package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Af05;
import com.pyteam.db.mbg.entity.Af05Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Af05Mapper {
    long countByExample(Af05Example example);

    int deleteByExample(Af05Example example);

    int deleteByPrimaryKey(Integer aaf501);

    int insert(Af05 record);

    int insertSelective(Af05 record);

    List<Af05> selectByExample(Af05Example example);

    Af05 selectByPrimaryKey(Integer aaf501);

    int updateByExampleSelective(@Param("record") Af05 record, @Param("example") Af05Example example);

    int updateByExample(@Param("record") Af05 record, @Param("example") Af05Example example);

    int updateByPrimaryKeySelective(Af05 record);

    int updateByPrimaryKey(Af05 record);
}