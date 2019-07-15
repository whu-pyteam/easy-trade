package com.pyteam.foreground.controller;

import com.alibaba.fastjson.JSONObject;
import com.pyteam.foreground.dto.Ac01Dto;
import com.pyteam.foreground.service.Ac01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import static com.pyteam.foreground.controller.LoginController.isLogin;
import static com.pyteam.foreground.controller.LoginController.getCookies;

@Controller
public class IndexController
{
    @Autowired
    private Ac01Service ac01Service;

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String wel(Model model)
    {
        try
        {
            model.addAttribute("type", 1);
            model.addAttribute("ac01List", ac01Service.selectById());
            return "index";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }


    @RequestMapping(value="goodShow.html",method=RequestMethod.GET)
    public String searchById(int id, Model model)
    {
        try
        {
            model.addAttribute("ac01", ac01Service.findById(id));
            model.addAttribute("type", 1);
            return "goodShow";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

    @RequestMapping(value = "/goodSearch.html", method = RequestMethod.POST)
    public String searchByValue(@RequestParam(value = "searchValue") String value, Model model)
    {
        System.out.println(value);
        try
        {
            model.addAttribute("searchList", ac01Service.searchByValue(value));
            model.addAttribute("type", 1);
            return "goodSearch";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }


    @RequestMapping(value = "/goodLaunch.html", method = RequestMethod.GET)
    public String add(HttpServletRequest request) throws Exception
    {
        if (isLogin(request))
        {
            return "goodLaunch";
        } else
        {
            return "error/relogin";
        }
    }

    @RequestMapping(value = "/goodLaunch.html", method = RequestMethod.POST)
    public String add(Ac01Dto dto, Model model) throws Exception
    {
        model.addAttribute("type","1");
        boolean res = ac01Service.addAc01(dto);
        return "goodLaunch";
    }
}
