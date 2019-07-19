package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.foreground.dto.Ab01Dto;
import com.pyteam.foreground.service.Ab01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import static com.pyteam.foreground.controller.LoginController.isLogin;
import static com.pyteam.foreground.controller.LoginController.getCookies;

@Controller
public class MemberInfo
{
    @Autowired
    Ab01Service ab01Service;

    @GetMapping("memberInfo.html")
    public String memberInfo(Model model,HttpServletRequest request, HttpServletResponse response)throws Exception
    {
        if (isLogin(request,response))
        {
            String username = getCookies(request,"username");
            Ab01 ab01 = ab01Service.getMemberInfo(Integer.parseInt(username));

            model.addAttribute("aab103",ab01.getAab103());
            model.addAttribute("aab104",ab01.getAab104());
            model.addAttribute("aab105",new SimpleDateFormat("yyyy-MM-dd").format(ab01.getAab105()));
            model.addAttribute("aab106",ab01.getAab106());
            model.addAttribute("aab107",ab01.getAab107());
            model.addAttribute("aab111",ab01.getAab111());

            return "memberInfo";
        } else
        {
            return "error/relogin";
        }
    }

    @PostMapping("memberInfoSubmit.html")
    public String memberInfoSubmit(Ab01Dto ab01Dto,HttpServletRequest request,HttpServletResponse response)throws Exception
    {
        System.out.println(ab01Dto.getAab103());
        if (isLogin(request,response))
        {
            String username = getCookies(request,"username");
            try
            {
                ab01Service.updateMemberInfo(Integer.parseInt(username),ab01Dto);
                return "memberInfo";
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return "error/404";
            }
        }
        else
        {
            return "error/relogin";
        }
    }

    @GetMapping("sellerInfo.html")
    public String sellerInfo(Integer id,Model model)throws Exception
    {
        System.out.println(id);
        try
        {
            Ab01 ab01 = ab01Service.getMemberInfo(id);
            model.addAttribute("aab102", ab01.getAab102());
            model.addAttribute("aab103", ab01.getAab103());
            model.addAttribute("aab104", ab01.getAab104());
            model.addAttribute("aab105", new SimpleDateFormat("yyyy-MM-dd").format(ab01.getAab105()));
            model.addAttribute("aab106", ab01.getAab106());
            model.addAttribute("aab107", ab01.getAab107());
            model.addAttribute("aab109", ab01.getAab109());
            model.addAttribute("aab111", ab01.getAab111());
            return "sellerInfo";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

}
