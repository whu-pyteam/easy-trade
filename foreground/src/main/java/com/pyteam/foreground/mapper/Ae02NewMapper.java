package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ae02;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author wjm
 * @date2019/7/20 11:24
 */
@Mapper
@Repository
public interface Ae02NewMapper
{
    @Insert("insert into ae02(aad301,aad101) values(#{aad301},#{aad101})")
    void addAe02(Ae02 ae02);

    @Delete("delete from ae02 where aad301=#{aad301}")
    void delAe02(int aad301);

    @Delete("delete from ae02 where aad101=#{aad101}")
    void delAdd101(int aad101);
}
