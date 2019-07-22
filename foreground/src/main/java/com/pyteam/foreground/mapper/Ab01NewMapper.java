package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ab01;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author wjm
 * @date2019/7/21 11:51
 */
@Mapper
@Repository
public interface Ab01NewMapper
{
    @Select("select aab103,aab101,aab102  from ab01 where aab101=#{aab101}")
    Ab01 selectad01(int aab101);
}
