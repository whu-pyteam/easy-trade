package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.foreground.service.Ad01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wjm
 * @date2019/7/8 19:14
 */
@Controller
@RequestMapping("ad01")
public class Ad01Controller
{
    @Autowired
    private Ad01Service ad01Service;
    @GetMapping("list")
    public String list(Model m)
    {
        m.addAttribute("ad01",ad01Service.listByAll());
        return "ad01/list";
    }
    @GetMapping("edit")
    public String edit(Model m)
    {
        m.addAttribute("ad01",ad01Service.findById(1));
        return "ad01/edit";
    }
    @PostMapping("edit")
    public String edit(@ModelAttribute("ad01")Ad01 ad01)
    {
        System.out.println(ad01);
        ad01Service.edit(ad01);
        return "ad01/edit";
    }

    @PostMapping(value="/select")
    public String likeQuery(@RequestParam(value = "aad105" ,required=false) String question, HttpSession session, Model m)
    {
        System.out.println(question);
        m.addAttribute("ad01",ad01Service.moreQuery(question));
        System.out.println(ad01Service.moreQuery(question).toString());
        return "ad01/select";
    }
    @GetMapping("select")
    public String Query()
    {
        return "ad01/select";
    }

    @PostMapping ("add")
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
        return "ad01/del";
    }
    @GetMapping("del")
    public String showdel(Model m)
    {
        m.addAttribute("ad01",ad01Service.findById(1));
        return "ad01/del";
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        //true:允许为空, false:不允许为空
    }

}


