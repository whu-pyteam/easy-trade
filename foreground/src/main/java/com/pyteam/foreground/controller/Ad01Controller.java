package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ae09;
import com.pyteam.foreground.dto.Ad01ac02Dto;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ad05Service;
import com.pyteam.foreground.service.Ae09Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

/**
 * @author wjm
 * @date2019/7/8 19:14
 */
@Controller
public class Ad01Controller
{
    @Autowired
    private Ad01Service ad01Service;
    @Autowired
    private Ad05Service ad05Service;
    @Autowired
    private Ae09Service ae09Service;

    private boolean isLogin;

    @GetMapping("/edit")
    public String edit(Model m,HttpServletRequest request, HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            int id = Integer.parseInt(getCookies(request, "userId"));
            m.addAttribute("ad01", ad01Service.findById(id));
            return "edit";
        }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }

    @PostMapping("/edit")
    public void edit(@RequestParam("aad101")int aad101, @RequestParam("aad105")String aad105,
                     @RequestParam("aad103")String aad103, @RequestParam("aad104") String aad104 , @RequestParam("aad107") Date aad107,
                     @RequestParam("aad108")Date aad108, HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println("kaishi");
        Ad01 ad01=new Ad01();
        BigDecimal bg=new BigDecimal(aad104);
        System.out.println(bg);
        ad01.setAad101(aad101);
        ad01.setAad105(aad105);
        ad01.setAad103(aad103);
        ad01.setAad104(bg);
        ad01.setAad108(aad108);
        ad01.setAad107(aad107);
        ad01Service.edit(ad01);
        System.out.println("修改" + ad01);

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
        return "edit";
    }

    @GetMapping("/selectbybq")
    public String sel(Model m,@RequestParam("aac202")String aac202,HttpServletResponse response, HttpServletRequest request)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin", isLogin);
            m.addAttribute("ad01", ae09Service.sel(aac202));
            return "select";
        }
        m.addAttribute("ad01", ae09Service.sel(aac202));
        m.addAttribute("isLogin",isLogin);
        return "select";
    }

    @GetMapping("/chon")
    public void shuijiao(Model m,@RequestParam("aad101")int aad101)
    {
        m.addAttribute("ad01",ad01Service.findbyaad101(aad101));
    }


    @PostMapping(value="/select")
    public String likeQuery(@RequestParam(value = "aad105" ,required=false) String question, HttpSession session, Model m)
    {
        System.out.println(question);
        m.addAttribute("ad01",ad01Service.moreQuery(question));
        return "select";
    }
    @GetMapping("/select")
    public String Query()
    {
        return "select";
    }

    @PostMapping ("/add")
    public String add(@ModelAttribute (value = "ad01")Ad01 ad01,HttpServletRequest request, HttpServletResponse response,Model m)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            ad01.setAab101(Integer.parseInt(getCookies(request, "userId")));
            ad01Service.add(ad01);
            return "add";
        }
        m.addAttribute("isLogin",isLogin);
        return "add";
    }
    @GetMapping("add")
    public String showadd(Model m,HttpServletRequest request,HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            return "add";
         }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }

    @PostMapping("/del")
    public String delete(@RequestParam(value = "aad101",required = false) String id)
    {
        System.out.println(id);
        int aid=Integer.parseInt(id);
        ad01Service.deleteById(aid);
        return "edit";
    }
    @GetMapping("del")
    public String showdel(Model m)
    {
        m.addAttribute("ad01",ad01Service.findById(1));
        return "del";
    }
    @RequestMapping("/delad01")
    public String delete(@RequestParam(value = "aad101",required = false) int id,HttpServletResponse response ,HttpServletRequest request,Model m)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin", isLogin);
            System.out.println(id);
            ad01Service.deleteById(id);
            return "edit";
        }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }

    @RequestMapping("cxk")
    public String showList(@RequestParam(value = "notsure",required=false)String id,Model m,HttpServletRequest request, HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin", isLogin);
            System.out.println(id);
            m.addAttribute("ad01", ad01Service.notSure(id));
            System.out.println(ad01Service.notSure(id).toString());
            return "select";
        }
        m.addAttribute("isLogin", isLogin);
        m.addAttribute("ad01", ad01Service.notSure(id));
        return "select";
    }


    @GetMapping("information")
    public String moreinformation(@RequestParam(value = "aad101")int aad101, Model m, HttpServletRequest request, HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if (isLogin)
        {

        }
        m.addAttribute("ad01",ad01Service.findbyaad101(aad101));
        m.addAttribute("isLogin", isLogin);
        return "/information";
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


