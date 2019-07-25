package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad05;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ad05Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

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

    private boolean isLogin;


    @GetMapping("addid")
    @ResponseBody
    public int add(@RequestParam(value = "aad101", required = false) int aad101, HttpServletRequest request,HttpServletResponse response,Model m)
    {
        isLogin = isLogin(request, response);
        if (isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            Ad01 ad01 = new Ad01();
            int aad106 = ad01Service.selectById(aad101).get(0).getAad106();
            aad106++;
            ad01.setAad106(aad106);
            ad01.setAad101(aad101);

            //点击悬赏的用户id

            int wantid = Integer.parseInt(getCookies(request, "userId"));
            Ad05 ad05 = new Ad05();
            ad05.setAab101(wantid);
            ad05.setAad101(aad101);

            if(wantid==ad01Service.findbyaad101(aad101).getAab101())
            {
                return 4;
            }

            Ad05 ad051 = ad05Service.aad501(ad05);
            if (ad051 == null)
            {
                //更新接收人数
                ad01Service.editcount(ad01);
                //
                ad05Service.addad05(ad05);
                return 1;
            } else
            {
                return 2;
            }
        }
        m.addAttribute("isLogin",isLogin);
        return 3;
    }


    @GetMapping("ad01Accept")
    public String show(Model m, HttpServletRequest request, HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if (isLogin)
        {
            int id = Integer.parseInt(getCookies(request, "userId"));
            List<Ad05> ad05List = new ArrayList<>();
            List<Ad01> ad01List = new ArrayList<>();
            ad05List = ad05Service.selectbyaab101(id);
            int count = ad05Service.count(id);
            for (int i = 0; i < count; i++)
            {
                int aad101 = ad05List.get(i).getAad101();
                ad01List.add(ad01Service.findbyaad101(aad101));
            }
            m.addAttribute("isLogin", isLogin);
            m.addAttribute("ad01", ad01List);
            return "ad01Accept";
        }
        m.addAttribute("isLogin", isLogin);
        return "ad01list";
    }

    @PostMapping("ad01Accept")
    public String show(HttpServletRequest request, HttpServletResponse response, @RequestParam("aad101") int aad101, Model m)
    {
        isLogin = isLogin(request, response);
        if (isLogin)
        {
            m.addAttribute("isLogin", isLogin);
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            ad05Service.delete(aad101, aab101);
            return "ad01Accept";
        }
        m.addAttribute("isLogin", isLogin);
        return "ad01list";
    }
}