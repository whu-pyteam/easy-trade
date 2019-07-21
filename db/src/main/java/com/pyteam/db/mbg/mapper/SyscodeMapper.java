package com.pyteam.db.mbg.mapper;

import com.pyteam.db.mbg.entity.Syscode;
import com.pyteam.db.mbg.entity.SyscodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SyscodeMapper {
    long countByExample(SyscodeExample example);

    int deleteByExample(SyscodeExample example);

    int deleteByPrimaryKey(Integer syscodeid);

    int insert(Syscode record);

    int insertSelective(Syscode record);

    List<Syscode> selectByExample(SyscodeExample example);

    Syscode selectByPrimaryKey(Integer syscodeid);

    int updateByExampleSelective(@Param("record") Syscode record, @Param("example") SyscodeExample example);

    int updateByExample(@Param("record") Syscode record, @Param("example") SyscodeExample example);

    int updateByPrimaryKeySelective(Syscode record);

    int updateByPrimaryKey(Syscode record);
}