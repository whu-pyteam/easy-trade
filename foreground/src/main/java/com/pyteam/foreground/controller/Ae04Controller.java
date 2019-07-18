package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.entity.Ae04;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ae04Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author wjm
 * @date2019/7/12 9:06
 */
@Controller
public class Ae04Controller
{
    @Autowired
    private Ae04Service ae04Service;
    @Autowired
    private Ad01Service ad01Service;

    @GetMapping("/ad01/forklist")
    public String view(Model m)
    {
        Ad01 ad01=new Ad01();
        ad01.setAab101(1);
        m.addAttribute("ad01",ae04Service.showthem(ad01));

        return "/ad01/forklist";
    }
    @PostMapping("/ad01/forklist")
    public void view(@ModelAttribute("ad01")Ad01 ad01)
    {
        Ad01 ad01list=new Ad01();
        int aab101=1;
        ad01list.setAab101(aab101);
        ad01list.setAad101(ad01.getAad101());
        System.out.println(ad01list);
        ae04Service.deleteaddad04(ad01list);
    }


    @GetMapping("ad01list")
    public String showall(Model m)
    {
        m.addAttribute("ad01",ad01Service.listByAll());
        return"ad01list";
    }

    @GetMapping("ad01list.html")
    public String showall0(Model m)
    {
        m.addAttribute("ad01",ad01Service.listByAll());
        return"ad01list";
    }
    @GetMapping("ad01/list")
    public String view(@RequestParam("aad101")int aad101)
    {
        Ad04 ad04=new Ad04();
        ad04.setAab101(1);
        Ad01 ad01=new Ad01();
        ad01.setAad101(aad101);
        ae04Service.addad04(ad04,ad01);
        return "ad01/list";
    }
}
