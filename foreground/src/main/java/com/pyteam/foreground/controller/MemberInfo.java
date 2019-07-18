package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.foreground.dto.Ab01Dto;
import com.pyteam.foreground.service.Ab01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.pyteam.foreground.controller.LoginController.isLogin;
import static com.pyteam.foreground.controller.LoginController.getCookies;

@Controller
public class MemberInfo
{
    @Autowired
    Ab01Service ab01Service;

    @RequestMapping("memberInfo.html")
    public String memberInfo(HttpServletRequest request, HttpServletResponse response)throws Exception
    {
        if (isLogin(request,response))
        {
            String username = getCookies(request,"username");
            Ab01 ab01 = ab01Service.getMemberInfo(Integer.parseInt(username));

            //Todo



            return "memberInfo";
        } else
        {
            return "error/relogin";
        }
    }

    @RequestMapping("memberInfoSubmit.html")
    public String memberInfoSubmit(Ab01Dto ab01Dto,HttpServletRequest request,HttpServletResponse response)
    {
        return null;
    }

}
