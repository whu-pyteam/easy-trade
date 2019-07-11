package com.pyteam.background.mapper;

import com.pyteam.db.mbg.entity.Af06;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/10 14:27
 */
@Repository
public interface Af02Af06Mapper
{
    List<Af06> getRoleListById(Integer id);
}
