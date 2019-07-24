package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ae07;
import com.pyteam.foreground.mapper.Ac05NewMapper;
import com.pyteam.foreground.mapper.Ae07NewMapper;
import com.pyteam.foreground.service.Ac05Service;
import com.pyteam.foreground.service.Ad05Service;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.ValueMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.pyteam.foreground.controller.LoginController.isLogin;

/**
 * @author wjm
 * @date2019/7/15 16:11
 */
@Controller
@Repository
public class Ac05Controller
{
    @Autowired
    private Ac05Service ac05Service;
    @Autowired
    private Ad05Service ad05Service;

    private boolean isLogin;
    @PostMapping("orderAdd")
    public String view(@ModelAttribute("ac05")Ac05 ac05,Model m, HttpServletResponse response,HttpServletRequest request)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            int aad101 = ac05Service.ret();
            ac05Service.add(ac05, aad101);
            return "orderAdd";
        }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }

    @GetMapping("/orderAdd")
    public String  select(@RequestParam(value="aad101")int aad101,Model m,HttpServletRequest request,HttpServletResponse response)
    {

        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin", isLogin);
            int id = aad101;
            m.addAttribute("ad05", ad05Service.selectbyaad101(id));
            ac05Service.save(id);
            return "orderAdd";
        }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        //true:允许为空, false:不允许为空
    }
}
