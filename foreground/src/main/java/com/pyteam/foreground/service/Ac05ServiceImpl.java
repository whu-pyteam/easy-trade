package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ae07;
import com.pyteam.foreground.mapper.Ac05NewMapper;
import com.pyteam.foreground.mapper.Ae07NewMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wjm
 * @date2019/7/15 16:02
 */
@Repository
@Service
public class Ac05ServiceImpl implements Ac05Service
{

    int aad101;

    @Autowired
    private Ac05NewMapper ac05NewMapper;

    @Autowired
    private Ae07NewMapper ae07NewMapper;

    @Transactional
    @Override
    public void add(Ac05 ac05,int aad101)
    {
        Date date= ac05.getAac511();
        SimpleDateFormat sd1= new SimpleDateFormat("yyyyMMddHH");
        String before=sd1.format(date);
        System.out.println(before);
        int aab101=ac05.getAab101();
        String aac502;
        int count;
        do
        {
            Integer after = (int) ((Math.random() * 9 + 1) * 10);
            StringBuilder a = new StringBuilder();
            a.append(aab101).append(before).append(after);
            aac502 = a.toString();
            System.out.println(aac502);
            count=ac05NewMapper.count(aac502);
        }
        while(count==1);

        ac05.setAac502(aac502);
        ac05NewMapper.insertAc05(ac05);
        System.out.println("插入成功");
        String mm=ac05.getAac508();
        System.out.println(mm);
        if("2".equals(mm))
        {
            Ae07 ae07=new Ae07();
            ae07.setAac501(ac05NewMapper.query(aac502));
            ae07.setAad101(aad101);
            System.out.println(aad101);
            ae07NewMapper.addAe07(ae07);
        }


    }

    @Override
    public int count(String id)
    {
        return ac05NewMapper.count(id);
    }

    @Override
    public void save(int aad101)
    {
        this.aad101=aad101;
    }
    @Override
    public int ret()
    {
        return aad101;
    }
}
