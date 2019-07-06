package com.pyteam.db.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.pyteam.db.entity.Test;
import org.springframework.stereotype.Repository;

/**
 * @author tyc
 * @date 2019/7/1 10:54
 */
@Repository
public interface TestMapper
{
    @Select("select * from test where name = #{name}")
    Test findByName(@Param("name") String name);

    @Insert("insert into test(name, age) values(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
