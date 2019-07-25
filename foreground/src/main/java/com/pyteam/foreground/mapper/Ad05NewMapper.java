package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ad05;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/13 9:25
 */
@Mapper
@Repository
public interface Ad05NewMapper
{
    @Select("select aab101 from ad05 where aad101=#{aad101}")
    Ad05 select(Ad05 ad05);
    @Insert("insert into  ad05(aad101,aab101) values (#{aad101},#{aab101})")
    void addad05(Ad05 ad05);
    @Select("select aad501 from ad05 where aad101=#{aad101} and aab101=#{aab101}")
    Ad05 aad501(Ad05 ad05);

    @Select("select aad101 from ad05 where aab101=#{aab101}")
    List<Ad05> slect(int aab101);

    @Select("select count(aad101) from ad05 where aab101=#{aab101}")
    int count(int aab101);

    @Delete("delete from ad05 where aad101=#{aad101} and aab101=#{aab101}")
    void delete(int aad101, int aab101);

    @Delete("delete from ad05 where aad101=#{aad101}")
    void delAad101(int aad101);

    @Select("select aab101 from ad05 where aad101=#{aad101}")
    List<Ad05> selectbyaad101(int aad101);

    @Select("select count(aab101) from ad05 where aad101=#{aad101}")
    int countaad101(int aad101);

}
