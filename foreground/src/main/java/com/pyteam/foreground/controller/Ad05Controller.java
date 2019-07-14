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
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping("ad01/addid")
//    public String add()
//    {
//        return "ad01/addid";
//    }

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

}
