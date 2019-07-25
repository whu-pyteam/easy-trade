package com.pyteam.foreground.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.foreground.dto.Ad01ac02Dto;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ae04Service;
import com.pyteam.foreground.service.Ae07Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.Map;

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

/**
 * @author wjm
 * @date2019/7/12 9:06
 */
@Controller
public class Ae04Controller
{
    @Autowired
    private Ae04Service ae04Service;
    @Autowired
    private Ad01Service ad01Service;
    @Autowired
    private Ae07Service ae07Service;
    private boolean isLogin;


    @GetMapping("forklist")
    public String view(Model m,HttpServletResponse response,HttpServletRequest request)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            Ad01 ad01 = new Ad01();
            ad01.setAab101(Integer.parseInt(getCookies(request,"userId")));
            m.addAttribute("ad01", ae04Service.showthem(ad01));
            m.addAttribute("isLogin",isLogin);
            return "forklist";
        }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }
    @PostMapping("forklist")
    public void view(@ModelAttribute("ad01")Ad01 ad01,Model m,HttpServletResponse response,HttpServletRequest request)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            Ad01 ad01list = new Ad01();
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            ad01list.setAab101(aab101);
            ad01list.setAad101(ad01.getAad101());
            System.out.println(ad01list);
            ae04Service.deleteaddad04(ad01list);
        }
        m.addAttribute("isLogin",isLogin);
    }


    @GetMapping("ad01list")
    public String anvon(Model m, HttpServletRequest request, HttpServletResponse response,int pageNum)
    {
        Map<String,Object> ad01map=ae07Service.nul(pageNum,8);
        int pageCount=(int)ad01map.get("pageCount");
        if(pageCount == 0)
        {
            pageCount = 1;
        }
        isLogin = isLogin(request, response);
        if (isLogin)
        {
            m.addAttribute("isLogin",isLogin);
        }
        m.addAttribute("isLogin", isLogin);
        m.addAttribute("pageNum", pageNum);
        m.addAttribute("pageCount", pageCount);
        m.addAttribute("ad01",(List<Ad01ac02Dto>)ad01map.get("ad01ac02DtoList") );
        return "ad01list";
    }
//    @PostMapping("ad01list")
//    public String anvon(HttpServletRequest request, HttpServletResponse response,Model model)
//    {
//
//    }

    @GetMapping("ad01list.html")
    public String showall0(Model m, HttpServletRequest request, HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if (isLogin)
        {
            m.addAttribute("isLogin", isLogin);
        }
        m.addAttribute("isLogin", isLogin);

        m.addAttribute("ad01", ad01Service.listByAll());
        return "ad01list";
    }
    @GetMapping("list")
    @ResponseBody
    public int view(@RequestParam(value = "aad101",required = false)int aad101,HttpServletRequest request, HttpServletResponse response,Model m)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            Ad04 ad04 = new Ad04();
            ad04.setAab101(Integer.parseInt(getCookies(request, "userId")));
            Ad01 ad01 = new Ad01();
            ad01.setAad101(aad101);
            int i = ae04Service.addad04(ad04, ad01);
            System.out.println();
            return i;
        }
        m.addAttribute("isLogin",isLogin);
        return 10;
    }

    @GetMapping("listcancel")
    @ResponseBody
    public int vire(@RequestParam(value="aad101")int aad101,HttpServletRequest request)
    {
        Ad01 ad01list=new Ad01();
        int aab101=Integer.parseInt(getCookies(request, "userId"));
        ad01list.setAab101(aab101);
        ad01list.setAad101(aad101);
        System.out.println(ad01list);
        ae04Service.deleteaddad04(ad01list);
        return 1;
    }

}
