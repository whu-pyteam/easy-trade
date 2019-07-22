package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ac02;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author wjm
 * @date2019/7/18 15:51
 */
@Mapper
@Repository
public interface Ac02NewMapper
{
    //  设置标签名称插入

    @Insert("insert into ac02(aac202) values(#{aac202})")
    void addAc02(Ac02 ac02);

    //查询标签名称是否存在

    @Select("select count(aac201) from ac02 where aac202=#{aac202}")
    int countsquery(Ac02 ac02);

    @Select("select aac201 from ac02 where aac202=#{aac202}")
    Ac02 selectac02(Ac02 ac02);

    @Select("select aac202 from ac02 where aac201=#{aac201}")
    Ac02 selectAc01(Ac02 ac02);

}
