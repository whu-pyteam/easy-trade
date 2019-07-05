package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ac02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ac02Mapper {
    int countByExample(Ac02Example example);

    int deleteByExample(Ac02Example example);

    int deleteByPrimaryKey(Integer aac201);

    int insert(Ac02 record);

    int insertSelective(Ac02 record);

    List<Ac02> selectByExample(Ac02Example example);

    Ac02 selectByPrimaryKey(Integer aac201);

    int updateByExampleSelective(@Param("record") Ac02 record, @Param("example") Ac02Example example);

    int updateByExample(@Param("record") Ac02 record, @Param("example") Ac02Example example);

    int updateByPrimaryKeySelective(Ac02 record);

    int updateByPrimaryKey(Ac02 record);
}