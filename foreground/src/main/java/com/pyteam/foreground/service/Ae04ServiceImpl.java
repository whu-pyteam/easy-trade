package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.entity.Ae04;
import com.pyteam.db.mbg.mapper.Ad01Mapper;
import com.pyteam.foreground.mapper.Ad04NewMapper;
import com.pyteam.foreground.mapper.Ae04NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/17 16:38
 */
@Service
@Repository
public class Ae04ServiceImpl implements Ae04Service
{
    @Autowired
    private Ae04NewMapper ae04NewMapper;

    @Autowired
    private Ad04NewMapper ad04NewMapper;

    @Autowired
    private Ad01Mapper ad01Mapper;


    @Override
    public void addad04(Ad04 ad04, Ad01 ad01)
    {
//        添加ad04 ad01
//        ad04要提前放好用户流水号 aab101

        List<Ad04> ad04List=ad04NewMapper.findById(ad04);
        if(ad04List.isEmpty())
        {
            Ad01 ad01s=new Ad01();
            ad01s.setAab101(ad04List.get(0).getAab101());
            ad04NewMapper.addad01(ad01s);
        }
        else
        {

        }
        int aad401=ad04NewMapper.findById(ad04).get(0).getAad401();
        Ae04 ae04s=new Ae04();
        ae04s.setAad401(aad401);
        ae04s.setAad101(ad01.getAad101());
        if(ae04NewMapper.select(ae04s)==null)
        {
            ae04NewMapper.addae04(ae04s);
        }
        else
            {
            System.out.println("收藏过");
        }
    }

    @Override
    public void deleteaddad04(Ad01 ad01)
    {
        int aab101=ad01.getAab101();
        int aad101=ad01.getAad101();
        Ad04 ad04=new Ad04();
        ad04.setAab101(aab101);
        Ae04 ae04=new Ae04();
        ae04.setAad101(aad101);
        ae04.setAad401(ad04NewMapper.findById(ad04).get(0).getAad401());
        ae04NewMapper.delete(ae04);
    }

    @Override
    public List<Ad01> showthem(Ad01 ad01)
    {
        int aab101=ad01.getAab101();
        Ad04 ad04=new Ad04();
        ad04.setAab101(aab101);
        List<Ad04> ad04list=ad04NewMapper.findById(ad04);
        if(ad04list.isEmpty())
        {
            return null;
        }
        int aad401=ad04list.get(0).getAad401();
        List<Ae04> ae04List=ae04NewMapper.query(aad401);
        List<Ad01> ad01List=new ArrayList<>();
        if(ae04List.isEmpty())
        {
            return null;
        }
        else
        {
            int count=ae04NewMapper.count(aad401);
            for(int i=0;i<count;i++)
            {
                int aad101=ae04NewMapper.query(aad401).get(i).getAad101();
                ad01List.add(ad01Mapper.selectByPrimaryKey(aad101));
            }
        }
        return ad01List;
    }
}
