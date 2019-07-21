package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.foreground.service.Ae02Service;
import com.pyteam.foreground.service.Ae07Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

/**
 * @author wjm
 * @date2019/7/16 18:14
 */

@Controller

public class Ae07Controller
{
    @Autowired
    private Ae07Service ae07Service;
    @Autowired
    private Ae02Service ae02Service;

    private Boolean isLogin;

    @GetMapping("myOrder")
    public String view(Model m, HttpServletRequest request, HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin",isLogin);
            int id = Integer.parseInt(getCookies(request, "userId"));
            m.addAttribute("ac05", ae07Service.select(id));
            return "myOrder";
        }
        m.addAttribute("isLogin",isLogin);
        return "ad01list";
    }

    @PostMapping("myOrder")
    public String edit(@ModelAttribute("ac05") Ac05 ac05,@RequestParam("aac502") String aac502,Model m,String action,HttpServletRequest request, HttpServletResponse response)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            m.addAttribute("isLogin", isLogin);

            if (action.equals("修改订单"))
            {
                System.out.println(ac05);
                ae07Service.update(ac05);

            } else if (action.equals("取消订单"))
            {
                System.out.println(aac502);
                Ac05 ac05list = new Ac05();
                ac05list.setAac502(aac502);
                ae07Service.delete(ac05list);
                System.out.println("取消运行");

            } else if (action.equals("完成订单"))
            {
                ae02Service.updatecc(aac502);
            }
        }
        m.addAttribute("isLogin",isLogin);
        return "myOrder";
    }

    @GetMapping("delorder")
    public void deleteOrder(@RequestParam("aac502")String aac502)
    {
        Ac05 ac05=new Ac05();
        ac05.setAac502(aac502);
        ae07Service.delete(ac05);
        System.out.println("取消运行");
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        //true:允许为空, false:不允许为空
    }
}
