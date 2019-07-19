package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ae07;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/16 9:06
 */
@Repository
@Mapper
public interface Ae07NewMapper
{
    @Transactional

    @Insert("insert into ae07(aad101,aac501) values(#{aad101},#{aac501})")
    void addAe07(Ae07 ae07);

    @Select("select aac501 from ae07 where aad101=#{aad101}")
    List<Ae07> select(int aad101);

    @Select("select aae701 from ae07 where aac501=#{aac501}")
    Ae07 selectbyaac501(Ae07 ae07);

}
