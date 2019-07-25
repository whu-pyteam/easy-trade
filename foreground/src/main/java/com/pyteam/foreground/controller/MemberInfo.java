package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.foreground.dto.Ab01Dto;
import com.pyteam.foreground.service.Ab01Service;
import com.pyteam.foreground.service.Ab06Service;
import com.pyteam.foreground.service.Ac01Service;
import com.pyteam.foreground.service.SyscodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;
import java.util.List;

import static com.pyteam.foreground.controller.LoginController.isLogin;
import static com.pyteam.foreground.controller.LoginController.getCookies;

@Controller
public class MemberInfo
{
    @Autowired
    private Ab01Service ab01Service;
    @Autowired
    private Ac01Service ac01Service;
    @Autowired
    private SyscodeService syscodeService;
    @Autowired
    private Ab06Service ab06Service;

    @GetMapping("memberInfo.html")
    public String memberInfo(Model model,HttpServletRequest request, HttpServletResponse response)throws Exception
    {
        if (isLogin(request,response))
        {
            String username = getCookies(request,"userId");
            Ab01 ab01 = ab01Service.getMemberInfo(Integer.parseInt(username));

            model.addAttribute("aab103",ab01.getAab103());
            model.addAttribute("aab104",ab01.getAab104());
            model.addAttribute("aab105",new SimpleDateFormat("yyyy-MM-dd").format(ab01.getAab105()));

            //String schoolName = syscodeService.getSchoolName(ab01.getAab106());
            model.addAttribute("aab106",ab01.getAab106());
            model.addAttribute("aab107",ab01.getAab107());
            model.addAttribute("aab111",ab01.getAab111());
            model.addAttribute("isLogin", isLogin(request, response));
            return "memberInfo";
        } else
        {
            return "error/relogin";
        }
    }

    @PostMapping("memberInfoSubmit.html")
    public String memberInfoSubmit(Ab01Dto ab01Dto,Model model,HttpServletRequest request,HttpServletResponse response)throws Exception
    {
        if (isLogin(request,response))
        {
            String username = getCookies(request,"userId");
            try
            {
                ab01Service.updateMemberInfo(Integer.parseInt(username),ab01Dto);
                model.addAttribute("isLogin", isLogin(request, response));
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
    public String sellerInfo(Integer id,Model model,HttpServletRequest request,HttpServletResponse response)throws Exception
    {
        try
        {
            Ab01 ab01 = ab01Service.getMemberInfo(id);

            //解析性别
            String sex=ab01.getAab104();
            if(ab01.getAab104().equals("1"))
            {
                sex="男";
            }
            else if(ab01.getAab104().equals("2"))
            {
                sex="女";
            }
            else
            {
                sex="保密";
            }

            String sign=ab01.getAab111();
            if(ab01.getAab111().equals(""))
            {
                sign="这个人有点懒，啥也没填...";
            }

            Integer syscodeid=ab01.getAab106();
            String schoolName = syscodeService.getSchoolName(syscodeid);

            model.addAttribute("aab101", ab01.getAab101());
            model.addAttribute("aab102", ab01.getAab102());
            model.addAttribute("aab103", ab01.getAab103());
            model.addAttribute("aab104", sex);
            model.addAttribute("aab105", new SimpleDateFormat("yyyy-MM-dd").format(ab01.getAab105()));
            model.addAttribute("aab106", schoolName);
            model.addAttribute("aab107", ab01.getAab107());
            model.addAttribute("aab109", ab01.getAab109());
            model.addAttribute("aab111", sign);

            List<Ac01> ac01List = ac01Service.getByOwner(id);
            model.addAttribute("ac01List",ac01List);
            model.addAttribute("isLogin", isLogin(request, response));
            return "sellerInfo";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

    @GetMapping("following.html")
    @ResponseBody
    public int following(String aab101,HttpServletRequest request,HttpServletResponse response)
    {
        if(isLogin(request,response))
        {
            String userId = getCookies(request,"userId");
            if(ab06Service.hasFollowed(Integer.parseInt(userId),Integer.parseInt(aab101)))
            {
                return 2;
            }
            else
            {
                if(userId.equals(aab101))
                {
                    return 4;
                }
                else
                {
                    ab06Service.addFollower(Integer.parseInt(userId),Integer.parseInt(aab101));
                    return 1;
                }

            }
        }
        else
        {
            return 0;
        }
    }

}
