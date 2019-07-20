package com.pyteam.foreground.controller;

import com.pyteam.foreground.service.Ab01Service;
import com.pyteam.foreground.service.Ad04Service;
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
    @Autowired
    private Ad04Service ad04Service;

    @PostMapping(value = "login.html")
    public boolean login(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        //获取用户输入的用户名
        String username=request.getParameter("username");
        //获取用户输入的密码
        String password=request.getParameter("password");
        Integer id = ab01Service.getMemberByUsername(username).getAab101();
        //获取用户拍卖收藏流水号
        String aad401_auc = ad04Service.getAad401(id, "2");
        //判断是否是会员
        if (ab01Service.isMember(username, password))
        {
            //是会员，则在cookie中保存用户名和密码
            setCookies(response,"username",username,600);
            setCookies(response, "userId", id.toString(), 600);
            setCookies(response,"password",password,600);
            setCookies(response, "aad401_auc", aad401_auc, 600);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * 退出登录
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @PostMapping(value = "logout.html")
    public boolean logout(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        if(isLogin(request,response))
        {
            delCookies(request,response,"username");
            delCookies(request,response,"userId");
            delCookies(request,response,"password");
            delCookies(request,response,"aad401_auc");
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
    public static boolean isLogin(HttpServletRequest request,HttpServletResponse response)
    {
        String username = getCookies(request,"username");
        String userId = getCookies(request, "userId");
        String password = getCookies(request,"password");
        String aad401_auc = getCookies(request, "aad401_auc");
        if(username != null && password != null)
        {
            setCookies(response,"username",username,600);
            setCookies(response, "userId", userId, 600);
            setCookies(response,"password",password,600);
            setCookies(response, "aad401_auc", aad401_auc, 600);
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
    public static void setCookies(HttpServletResponse response,String key,String value,int expiry)
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
    public static void delCookies(HttpServletRequest request,HttpServletResponse response,String name){
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
