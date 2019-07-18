package com.pyteam.foreground.mapper;
import com.pyteam.db.mbg.entity.Ae04;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 9:33
 */
@Repository
@Mapper
public interface Ae04NewMapper
{
    //插入悬赏号

    @Insert("insert into ae04(aad401,aad101) values (#{aad401},#{aad101})")
    void addae04( Ae04 ae04);

    //查询悬赏号

    @Select("select aad101 from ae04 where aad401=#{aad401}")
    List <Ae04> query(int aad401);

    //同一人的收藏量

    @Select("select count(aad101) from ae04 where aad401=#{id}")
    int count (int id);

    //删除悬赏收藏项

    @Delete("delete from ae04 where aad401=#{aad401} and aad101=#{aad101}")
    void delete(Ae04 ae04);

    //查询收藏项是否存在

    @Select("select aae401 from ae04 where aad401=#{aad401} and aad101=#{aad101}")
    Ae04 select(Ae04 ae04);
}
