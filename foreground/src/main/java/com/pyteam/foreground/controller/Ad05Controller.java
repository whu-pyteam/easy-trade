package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad05;
import com.pyteam.foreground.mapper.Ad01NewMapper;
import com.pyteam.foreground.mapper.Ad05NewMapper;
import com.pyteam.foreground.mapper.Ae04NewMapper;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ad05Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/13 11:17
 */
@Controller
public class Ad05Controller
{
    @Autowired
    private Ad05Service ad05Service;
    @Autowired
    private Ad01Service ad01Service;



    @GetMapping ("ad01/addid")
    public String add(@RequestParam(value = "aad101",required = false)int aad101, Session session)
    {
        Ad01 ad01=new Ad01();

        int aad106=ad01Service.selectById(aad101).get(0).getAad106();
        aad106++;
        ad01.setAad106(aad106);
        ad01.setAad101(aad101);

        //点击悬赏的用户id

        int wantid=2;
        Ad05 ad05=new Ad05();
        ad05.setAab101(wantid);
        ad05.setAad101(aad101);

        Ad05 ad051=ad05Service.aad501(ad05);
        if(ad051==null)
        {
            //更新接收人数
            ad01Service.editcount(ad01);
            //
            ad05Service.addad05(ad05);
            System.out.println("此前没有,添加!!");
        }
        else {

        }
        return "ad01/select";
    }


    @GetMapping("ad01/ad01Accept")
    public String show(Model m, Session session)
    {
        int id=2;
        List<Ad05> ad05List=new ArrayList<>();
        List<Ad01> ad01List=new ArrayList<>();
        ad05List=ad05Service.selectbyaab101(id);
        int count =ad05Service.count(id);
        for(int i=0;i<count;i++)
        {
            int aad101=ad05List.get(i).getAad101();
            ad01List.add(ad01Service.findbyaad101(aad101));
        }

        m.addAttribute("ad01",ad01List);
        return "ad01/ad01Accept";
    }

    @PostMapping("ad01/ad01Accept")
    public String show(@RequestParam(value = "aad101")int aad101)
    {
        int aab101=2;
        ad05Service.delete(aad101,aab101);
        return "ad01/ad01Accept";
    }

}
