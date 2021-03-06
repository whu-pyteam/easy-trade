package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad03;
import com.pyteam.foreground.dto.Ae02Dto;
import com.pyteam.foreground.service.Ac05Service;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ae02Service;
import com.pyteam.foreground.service.Ae07Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

/**
 * @author wjm
 * @date2019/7/20 8:45
 * 主要是悬赏评价操作
 */
@Controller
public class Ae02Controller
{
    @Autowired
    private Ad01Service ad01Service;
    @Autowired
    private Ae02Service ae02Service;
    @Autowired
    private Ae07Service ae07Service;
    @Autowired
    private Ac05Service ac05Service;

    private Boolean isLogin;

    Ae02Dto ae02Dto=new Ae02Dto();

    @GetMapping("addad03")
    public String mo(@RequestParam("aac502")String aac502,Model m,HttpServletRequest request,HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            int i = Integer.parseInt(getCookies(request, "userId"));

            ae02Dto.setAac502(aac502);
            m.addAttribute("aab101", i);
            return "addad03";
        }

        m.addAttribute("isLogin",isLogin);
        return "ad01lsit";
    }

    @PostMapping("ifaddad03")
    @ResponseBody
    public int nno(@RequestParam("aac502")String aac502,Model m,HttpServletRequest request,HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
         m.addAttribute("isLogin",isLogin);
        }
        m.addAttribute("isLogin",isLogin);
        int i=ae07Service.state(aac502);
        return i;
    }

    @PostMapping("addad03")
    public String mo(@ModelAttribute("ad03") Ad03 ad03,Model m,HttpServletResponse response,HttpServletRequest request)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
        }
        m.addAttribute("isLogin",isLogin);
        int i = Integer.parseInt(getCookies(request, "userId"));
        ad03.setAab101(i);
        String aac502=ae02Dto.getAac502();
        ae07Service.updatecommit(aac502);
        ae02Service.insert(ad03,aac502);
        return "myComment";
    }

    @GetMapping("helpOrder")
    public String mo(Model m, HttpServletRequest request, HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if (isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            m.addAttribute("ac05", ae02Service.queryByAab101(aab101));
            return "helpOrder";
        }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }
    @PostMapping("helpOrder")
    public String wie(@RequestParam("aac503") String aac503,Model m,@RequestParam("aac502")String aac502, String action,HttpServletRequest request,HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if (isLogin)
        {
            m.addAttribute("isLogin",isLogin);
        }
        m.addAttribute("isLogin",isLogin);
        if(action.equals("确认订单"))
        {
            System.out.println(aac502);
            ae02Service.updateaccpet(aac502);
        }
        else if(action.equals("取消接受"))
        {
        }
        return "helpOrder";
    }

    @GetMapping("myComment")
    public String nnc(Model m,HttpServletResponse response,HttpServletRequest request)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            int i = Integer.parseInt(getCookies(request, "userId"));
            m.addAttribute("ad03", ae02Service.qe(i));
            System.out.println(ae02Service.qe(i));
            return "myComment";
        }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }

    @PostMapping("myComment")
    public void ss(@ModelAttribute("ad03")Ad03 ad03,String action,HttpServletRequest request,HttpServletResponse response,Model m)
    {
        isLogin = isLogin(request, response);
        if (isLogin)
        {
            m.addAttribute("isLogin", isLogin);
            int i = Integer.parseInt(getCookies(request, "userId"));
            if (action.equals("提交修改"))
            {
                System.out.println(ad03);
                ad03.setAab101(i);
                ae02Service.update(ad03);
            } else if (action.equals("删除评论"))
            {
                int aad301 = ad03.getAad301();
                ae02Service.del(aad301);
            }
        }
        m.addAttribute("isLogin", isLogin);
    }
    @GetMapping("delmyComment")
    @ResponseBody
    public int  onvsi(@RequestParam("aad301")int aad301)
    {
        ae02Service.del(aad301);
        return 1;
    }
}
