package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.foreground.service.Ac01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

@Controller
public class MyBelongings
{

    @Autowired
    private Ac01Service ac01Service;

    @GetMapping("myGood.html")
    public String myGood(Model model, HttpServletRequest request, HttpServletResponse response)
    {
        //判断用户是否登录
        if (isLogin(request,response))
        {
            String username = getCookies(request,"username");

            List<Ac01> ac01List = ac01Service.getByOwner(Integer.parseInt(username));
            model.addAttribute("ac01List",ac01List);
            return "myGood";
        }
        else
        {
            return "error/relogin";
        }
    }
}
