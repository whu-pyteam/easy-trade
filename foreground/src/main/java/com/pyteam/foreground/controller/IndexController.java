package com.pyteam.foreground.controller;

import com.pyteam.foreground.dto.Ac01Dto;
import com.pyteam.foreground.service.Ac01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController
{
    @Autowired
    private Ac01Service ac01Service;

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

    @RequestMapping(value = "/goodLaunch.html", method = RequestMethod.GET)
    public String add(Model model) throws Exception
    {
        return "goodLaunch";
    }

    @RequestMapping(value = "/goodLaunch.html", method = RequestMethod.POST)
    public String add(Ac01Dto dto, Model model) throws Exception
    {
        model.addAttribute("type","1");
        boolean res = ac01Service.addAc01(dto);
        return "goodLaunch";
    }
}
