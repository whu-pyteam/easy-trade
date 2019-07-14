package com.pyteam.foreground.mapper;

import com.pyteam.db.mbg.entity.Ad05;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author wjm
 * @date2019/7/13 9:25
 */
@Service
@Repository
public interface Ad05NewMapper
{
    @Select("select aab101 from ad05 where aad101=#{aad101}")
    Ad05 select(Ad05 ad05);
    @Insert("insert into  ad05(aad101,aab101) values (#{aad101},#{aab101})")
    void addad05(Ad05 ad05);
    @Select("select aad501 from ad05 where aad101=#{aad101} and aab101=#{aab101}")
    Ad05 aad501(Ad05 ad05);

}
