package com.pyteam.foreground.service;

import com.github.pagehelper.PageHelper;
import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad05;
import com.pyteam.db.mbg.mapper.Ad01Mapper;
import com.pyteam.foreground.dto.Ad01Dto;
import com.pyteam.foreground.dto.Ad01ac02Dto;
import com.pyteam.foreground.mapper.Ad01NewMapper;
import com.pyteam.foreground.mapper.Ad05NewMapper;
import com.pyteam.foreground.mapper.Ae04NewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/8 11:01
 */


@Service
@Transactional
public class Ad01Service
{
        @Autowired
        private Ad01Mapper ad01Mapper;
        @Autowired
        private Ad01NewMapper ad01NewMapper;
        @Autowired
        private Ad05NewMapper ad05NewMapper;
        @Autowired
        private Ae09Service ae09Service;
        @Autowired
        private Ae04NewMapper ae04NewMapper;


        public void add(Ad01 ad01)
        {
            ad01NewMapper.addad01(ad01);
        }

        //不定条件查询

        public List<Ad01> notSure(String question)
        {
            return ad01NewMapper.notSure(question,question);
        }
        //根据订单号查询

        public List<Ad01> selectById(int id)
        {
            return ad01NewMapper.findByPrimaryKey(id);
        }


        public List<Ad01> listByAll()
        {
            PageHelper.startPage(1,8);
            return ad01NewMapper.listByAll();
        }


        public void deleteById(int id)
        {
            ae04NewMapper.deleteany(id);
            ad01Mapper.deleteByPrimaryKey(id);
        }


        public void edit(Ad01 ad01)
        {
            ad01NewMapper.updatenn(ad01);
        }


        public List<Ad01> moreQuery(String question)
        {
            return  ad01NewMapper.moreQuery(question);
        }


        public List<Ad01ac02Dto> findById(int id)
        {
            List<Ad01ac02Dto>ad01ac02DtoList=new ArrayList<>();
            List<Ad01> ad01List=ad01NewMapper.findallById(id);
            int count=ad01NewMapper.count(id);
            System.out.println(count);

            //审核情况可能导致数目不一样
            for(int i=0;i<count;i++)
            {
                if(ad01List==null)
                {

                }
                else
                {
                    int aad101 = ad01List.get(i).getAad101();
                    List<Ac02> ac02List = ae09Service.query(aad101);
                    Ad01ac02Dto ad01ac02Dto = new Ad01ac02Dto();
                    ad01ac02Dto.setAd01(ad01List.get(i));
                    ad01ac02Dto.setAc02List(ac02List);
                    ad01ac02DtoList.add(ad01ac02Dto);
                }
            }
            return ad01ac02DtoList;
        }


        public Ad01 findbyaad101(int aad101)
        {
            return ad01Mapper.selectByPrimaryKey(aad101);
        }


        public void editcount(Ad01 ad01)
        {
            ad01NewMapper.updateaad106(ad01);
        }


        public List<Ad05> select(int id)
        {
            List<Ad01Dto> ad01DtoList=new ArrayList<>();

            List<Ad01> ad01List=ad01NewMapper.findById(id);
            List<Ad05> ad05List=new ArrayList<>();

            int count=ad01NewMapper.count(id);
            for(int i=0;i<count;i++)
            {
                int aad101=ad01List.get(i).getAad101();
                System.out.println(aad101);
                List<Ad05> ad05List1=ad05NewMapper.selectbyaad101(aad101);
                if(ad05List1==null)
                {
                    ad05List.add(i,ad05List1.get(0));
                }
                ad05List.add(i,null);
//            ad01DtoLists.get(i).setAd01(ad01List.get(i));
//            ad01DtoList.get(i).setAd05s(ad05List);
//            ad01DtoList.add(i,ad01DtoLists.get(i));

            }

            return ad05List;
        }

}


