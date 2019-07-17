package com.pyteam.foreground.controller;

import com.pyteam.foreground.service.Ab01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController
{
    @Autowired
    Ab01Service ab01Service;

    @PostMapping(value = "login.html")
    public boolean login(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        //获取用户输入的用户名
        String username=request.getParameter("username");
        //获取用户输入的密码
        String password=request.getParameter("password");
        //判断是否是会员
        if (ab01Service.isMember(Integer.parseInt(username), password))
        {
            //是会员，则在cookie中保存用户名和密码
            setCookies(response,"username",username,120);
            setCookies(response,"password",password,120);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * 判断用户是否登录
     * @param request
     * @return
     */
    public static boolean isLogin(HttpServletRequest request)
    {
        if(getCookies(request,"username")!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    /**
     * 辅助方法：设置cookie
     * @param response
     * @param key
     * @param value
     * @param expiry
     */
    public void setCookies(HttpServletResponse response,String key,String value,int expiry)
    {
        //设置cookie
        Cookie cookie=new Cookie(key,value);

        //设置销毁时间
        cookie.setMaxAge(expiry);
        response.addCookie(cookie);
    }


    /**
     * 辅助方法：获取cookie值
     * @param request
     * @return
     */
    public static String getCookies(HttpServletRequest request,String key){
        Cookie[] cookies =  request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(key)){
                    return cookie.getValue();
                }
            }
        }
        return  null;
    }

    /**
     * 辅助方法：删除cookie
     * @param request
     * @param response
     * @param name
     */
    public  void delCookies(HttpServletRequest request,HttpServletResponse response,String name){
        Cookie[] cookies =  request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(name)){
                    cookie.setValue(null);
                    cookie.setMaxAge(0);
                    cookie.setPath("/");
                    System.out.println("被删除的cookie名字为:"+cookie.getName());
                    response.addCookie(cookie);
                    break;
                }
            }
        }
    }
}