package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ac03;
import com.pyteam.db.mbg.entity.Ac03Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ac03Mapper {
    int countByExample(Ac03Example example);

    int deleteByExample(Ac03Example example);

    int deleteByPrimaryKey(Integer aac301);

    int insert(Ac03 record);

    int insertSelective(Ac03 record);

    List<Ac03> selectByExample(Ac03Example example);

    Ac03 selectByPrimaryKey(Integer aac301);

    int updateByExampleSelective(@Param("record") Ac03 record, @Param("example") Ac03Example example);

    int updateByExample(@Param("record") Ac03 record, @Param("example") Ac03Example example);

    int updateByPrimaryKeySelective(Ac03 record);

    int updateByPrimaryKey(Ac03 record);
}