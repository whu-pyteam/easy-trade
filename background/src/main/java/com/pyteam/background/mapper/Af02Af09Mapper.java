package com.pyteam.background.mapper;

import com.pyteam.db.mbg.entity.Af09;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/5 15:20
 */
@Repository
public interface Af02Af09Mapper
{
    /**
     * 获取所有权限
     * @param id
     * @return
     */
    List<Af09> getPermissionList(@Param("aaf201") Integer id);
}
