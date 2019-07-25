package com.pyteam.foreground.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ae07;
import com.pyteam.db.mbg.mapper.Ac05Mapper;
import com.pyteam.db.mbg.mapper.Ae07Mapper;
import com.pyteam.foreground.dto.Ad01ac02Dto;
import com.pyteam.foreground.mapper.Ac05NewMapper;
import com.pyteam.foreground.mapper.Ad01NewMapper;
import com.pyteam.foreground.mapper.Ae07NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wjm
 * @date2019/7/16 8:59
 */
@Service
public class Ae07Service
{
     @Autowired
     private Ae07NewMapper ae07NewMapper;
     @Autowired
     private Ad01NewMapper ad01NewMapper;
     @Autowired
     private Ac05NewMapper ac05NewMapper;
     @Autowired
     private Ac05Mapper ac05Mapper;
     @Autowired
     private Ae07Mapper ae07Mapper;
     @Autowired
     private Ad01Service ad01Service;
     @Autowired
     private Ae09Service ae09Service;

     public void add(Ae07 ae07)
     {
          ae07NewMapper.addAe07(ae07);
     }

     public List<Ac05> select(int id)
     {
          List<Ad01> ad01List=ad01NewMapper.order(id);
          int count=ad01NewMapper.count(id);
          List<Ac05> ac05List=new ArrayList<>();
          for(int i=0;i<count;i++)
          {
               int aad101=ad01List.get(i).getAad101();
               if(!(ae07NewMapper.select(aad101).isEmpty()))
               {
                    List<Ae07> ae07List= ae07NewMapper.select(aad101);

                    int aac501 = ae07List.get(0).getAac501();
                    ac05List.add(ac05NewMapper.ac05List(aac501).get(0));

               }
          }
          System.out.println(ac05List);
          return ac05List;
     }

     public void update(Ac05 ac05)
     {
          ac05.setAac501(ac05NewMapper.query(ac05.getAac502()));

          ac05Mapper.updateByPrimaryKeySelective(ac05);
     }

     @Transactional

     public void delete(Ac05 ac05)
     {
          ac05.setAac501(ac05NewMapper.query(ac05.getAac502()));
          int aac501=ac05.getAac501();
          Ae07 ae07=new Ae07();
          ae07.setAac501(aac501);
          ae07.setAae701(ae07NewMapper.selectbyaac501(ae07).getAae701());
          ae07Mapper.deleteByPrimaryKey(ae07.getAae701());

          ac05NewMapper.deletebyaac501(ac05);
     }

     public int state(String aac502)
     {
          return ac05NewMapper.aac503(aac502);
     }


     public Map<String,Object> nul(int pageNum, int pageSize)
     {

          Page page = PageHelper.startPage(pageNum, pageSize);
          List<Ad01> ad01List=ad01NewMapper.listByAll();
          System.out.println(ad01List);
          List<Ad01ac02Dto> ad01ac02DtoList=new ArrayList<>();
          int i =ad01List.size();
         for(int n=0;n<i;n++)
         {
             if(ad01List==null)
             {
             }
             int aad101= ad01List.get(n).getAad101();
             List<Ac02> ac02List = ae09Service.query(aad101);
             Ad01ac02Dto ad01ac02Dto = new Ad01ac02Dto();
             ad01ac02Dto.setAd01(ad01List.get(n));
             ad01ac02Dto.setAc02List(ac02List);
             ad01ac02DtoList.add(ad01ac02Dto);
         }
          Map<String, Object> ad01map = new HashMap<>();
          ad01map.put("ad01ac02DtoList",ad01ac02DtoList);
          ad01map.put("pageCount",page.getPages());
          return ad01map;
     }

//        更新状态

     public void updatecommit(String aac502)
     {
         ac05NewMapper.updatecommit(aac502);
     }
}
