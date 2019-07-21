package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac03;
import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ad03;
import com.pyteam.db.mbg.entity.Ae02;
import com.pyteam.foreground.mapper.Ac05NewMapper;
import com.pyteam.foreground.mapper.Ad03NewMapper;
import com.pyteam.foreground.mapper.Ae02NewMapper;
import com.pyteam.foreground.mapper.Ae07NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/20 8:39
 */
@Service
public class Ae02Service
{
    @Autowired
    private Ac05NewMapper ac05NewMapper;
    @Autowired
    private Ad03NewMapper ad03NewMapper;
    @Autowired
    private Ae07NewMapper ae07NewMapper;
    @Autowired
    private Ae02NewMapper ae02NewMapper;


    public List<Ac05> queryByAab101(int aab101)
    {
        return ac05NewMapper.queryByAab101(aab101);
    }

    public void updateaccpet(String aac502)
    {
        ac05NewMapper.updatenn(aac502);
    }

    public void updatecc(String aac502)
    {
        ac05NewMapper.updatecc(aac502);
    }

    public int aab101(String aac502)
    {
        return ac05NewMapper.aab101(aac502);
    }

    public void insert(Ad03 ad03,String aac502)
    {

        ad03NewMapper.ins(ad03);
        int aac501=ac05NewMapper.query(aac502);
        int aad101=ae07NewMapper.aad101(aac501);
        Ae02 ae02=new Ae02();
        int aab101=ad03.getAab101();
        int count =ad03NewMapper.count(aab101);
        ae02.setAad301(ad03NewMapper.query(aab101).get(count-1).getAad301());
        ae02.setAad101(aad101);
        ae02NewMapper.addAe02(ae02);
    }

    public List<Ad03> qe(int aab101)
    {
        return ad03NewMapper.query(aab101);
    }


    public void update(Ad03 ad03)
    {
        ad03NewMapper.update(ad03);
    }

    public void del(int aad301)
    {
        ae02NewMapper.delAe02(aad301);
        ad03NewMapper.delAd03(aad301);
    }

}