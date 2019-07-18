package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.entity.Ae04;
import com.pyteam.foreground.mapper.Ad01NewMapper;
import com.pyteam.foreground.mapper.Ad04NewMapper;
import com.pyteam.foreground.mapper.Ae04NewMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 10:10
 */
public interface Ae04Service
{
    void addad04(Ad04 ad04, Ad01 ad01);
    void deleteaddad04(Ad01 ad01);
    List<Ad01> showthem(Ad01 ad01);
}
