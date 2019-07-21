package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ae09;
import com.pyteam.foreground.mapper.Ac02NewMapper;
import com.pyteam.foreground.mapper.Ad01NewMapper;
import com.pyteam.foreground.mapper.Ae09NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/15 15:37
 */
@Service
public class Ae09ServiceImpl implements Ae09Service
{
    @Autowired
    private Ae09NewMapper ae09NewMapper;

    @Autowired
    private Ac02NewMapper ac02NewMapper;
    @Autowired
    private Ad01NewMapper ad01NewMapper;

    @Override
    public int addAe09(Ae09 ae09, Ac02 ac02)
    {
        int count=ac02NewMapper.countsquery(ac02);
        if(count ==0)
        {
            ac02NewMapper.addAc02(ac02);
        }
        Ac02 ac02ss= ac02NewMapper.selectac02(ac02);
        int aac201=ac02ss.getAac201();
        ae09.setAac201(aac201);
        int number=ae09NewMapper.countThis(ae09);
        if(number==0)
        {
            ae09NewMapper.insert(ae09);
            return 1;
        }
        else
        {
            return 2;
        }

    }

    @Override
    public void update(Ae09 ae09)
    {
        ae09NewMapper.update(ae09);
    }

    @Override
    public int delete(int aad101,String aac202)
    {
        Ae09 ae09=new Ae09();
        Ac02 ac02=new Ac02();
        ac02.setAac202(aac202);
        if(ae09NewMapper.countAe09(aad101)==0)
        {
            return 3;
        }
        else if(ac02NewMapper.countsquery(ac02)==0)
        {
            return 2;
        }
        else
        {
            Ac02 ac021s = ac02NewMapper.selectac02(ac02);
            ae09.setAad101(aad101);
            ae09.setAac201(ac021s.getAac201());
            ae09NewMapper.delete(ae09);
            return 1;
        }
    }

    @Override
    public List<Ac02> query(int aad101)
    {
        int i=ae09NewMapper.countAe09(aad101);
        List<Ae09> ae09List=ae09NewMapper.select(aad101);
        List<Ac02> ac02List=new ArrayList<>();
        for(int n=0;n<i;n++)
        {
            if(ae09List.get(n).getAac201()==null)
            {
            }
            else
            {
                int aac201 = ae09List.get(n).getAac201();
                Ac02 ac02 = new Ac02();
                ac02.setAac201(aac201);
                ac02List.add(n, ac02NewMapper.selectAc01(ac02));
            }

        }
        return ac02List;
    }

    @Override
    public List<Ad01> sel(String aac202)
    {
        Ac02 list=new Ac02();
        list.setAac202(aac202);
        Ac02 ac02=ac02NewMapper.selectac02(list);
        int aac201=ac02.getAac201();

        List<Ae09>ae09List=ae09NewMapper.selectaad101(aac201);
        List<Ad01> ad01List=new ArrayList<>();
        int count=ae09NewMapper.countaae901(aac201);
        if(count!=0)
        {
            for(int i=0;i<count;i++)
            {
                int aad101=ae09List.get(i).getAad101();
                if (ad01NewMapper.findByPrimaryKey(aad101) != null)
                {
                    ad01List.add(i,ad01NewMapper.findByPrimaryKey(aad101).get(0));
                }
            }
        }
        return ad01List;
    }
}
