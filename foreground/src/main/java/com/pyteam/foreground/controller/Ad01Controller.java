package com.pyteam.foreground.controller;

import com.google.gson.JsonObject;
import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad05;
import com.pyteam.db.mbg.entity.Ae09;
import com.pyteam.foreground.service.Ac05Service;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ad05Service;
import com.pyteam.foreground.service.Ae09Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/8 19:14
 */
@Controller
@RequestMapping("/ad01")
public class Ad01Controller
{
    @Autowired
    private Ad01Service ad01Service;
    @Autowired
    private Ad05Service ad05Service;
    @Autowired
    private Ae09Service ae09Service;

    @GetMapping("/edit")
    public String edit(Model m)
    {
        int id=1;
        m.addAttribute("ad01",ad01Service.findById(id));
        System.out.println(ad01Service.findById(id));
        return "ad01/edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute("Ad01") Ad01 ad01)
    {
            ad01Service.edit(ad01);
            System.out.println("修改");
            return "ad01/edit";
    }

    @PostMapping("/biaoqian")
    @ResponseBody
    public int addaac202(@RequestParam(value = "aac202")String aac202,@RequestParam(value = "aad101")int aad101)
    {
        Ac02 ac02=new Ac02();
        ac02.setAac202(aac202);
        Ae09 ae09=new Ae09();
        ae09.setAad101(aad101);
        int i=ae09Service.addAe09(ae09,ac02);
        return i;
    }
    @PostMapping("/deleteLabel")
    @ResponseBody
    public int deleteaac202(@RequestParam(value = "aac202")String aac202,@RequestParam(value = "aad101")int aad101)
    {
        int i=ae09Service.delete(aad101,aac202);
        return i;
    }

    @GetMapping("ae09")
    public String a(Model m,@RequestParam(value = "aad101",required = false)int aad101)
    {

        m.addAttribute("ac02",ae09Service.query(aad101));
        System.out.println(m);
        return "ad01/edit";
    }

    @GetMapping("/selectbybq")
    public String sel(Model m,@RequestParam("aac202")String aac202)
    {
            m.addAttribute("ad01",ae09Service.sel(aac202));
            return"ad01/select";
    }

    @PostMapping(value="/select")
    public String likeQuery(@RequestParam(value = "aad105" ,required=false) String question, HttpSession session, Model m)
    {
        System.out.println(question);
        m.addAttribute("ad01",ad01Service.moreQuery(question));
        System.out.println(ad01Service.moreQuery(question).toString());
        return "ad01/select";
    }
    @GetMapping("/select")
    public String Query()
    {
        return "ad01/select";
    }

    @PostMapping ("/add")
    public String add(@ModelAttribute (value = "ad01")Ad01 ad01)
    {
        ad01.setAab101(1);
        ad01Service.add(ad01);
        return "ad01/add";
    }
    @GetMapping("add")
    public String showadd()
    {
        return "ad01/add";
    }

    @PostMapping("/del")
    public String delete(@RequestParam(value = "aad101",required = false) String id)
    {
        System.out.println(id);
        int aid=Integer.parseInt(id);
        ad01Service.deleteById(aid);
        return "ad01/edit";
    }
    @GetMapping("del")
    public String showdel(Model m)
    {
        m.addAttribute("ad01",ad01Service.findById(1));
        return "ad01/del";
    }
    @RequestMapping("/delad01")
    public String delete(@RequestParam(value = "aad101",required = false) int id)
    {
        System.out.println(id);
        ad01Service.deleteById(id);
        return "ad01/edit";
    }

    @RequestMapping("cxk")
    public String showList(@RequestParam(value = "notsure",required=false)String id,Model m)
    {
        System.out.println(id);
        m.addAttribute("ad01",ad01Service.notSure(id));
        System.out.println(ad01Service.notSure(id).toString());
        return "ad01/select";
    }


    @GetMapping("information")
    public String moreinformation(@RequestParam(value = "aad101")int aad101,Model m)
    {
        m.addAttribute("ad01",ad01Service.findbyaad101(aad101));
        return "ad01/information";
    }




    //    String 类型转化为Date 符合实体类

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        //true:允许为空, false:不允许为空
    }

}


