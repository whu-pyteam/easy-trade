package com.pyteam.foreground.controller;

import com.pyteam.foreground.service.Ac04Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.pyteam.foreground.controller.LoginController.isLogin;
import static com.pyteam.foreground.controller.LoginController.getCookies;

@Controller
public class CartController
{
    @Autowired
    private Ac04Service ac04Service;

    @GetMapping("cart.html")
    public String cartShow(HttpServletRequest request)
    {
        //判断用户是否登录
        if (isLogin(request))
        {
            //从cookie中取出用户id
            String username = getCookies(request,"username");
            System.out.println(username);
            return "cart";
        } else
        {
            return "error/relogin";
        }
    }
}
