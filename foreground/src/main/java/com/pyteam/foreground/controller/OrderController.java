package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Syscode;
import com.pyteam.foreground.dto.Ac05Dto;
import com.pyteam.foreground.service.Ab01Service;
import com.pyteam.foreground.service.Ac05Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.math.BigDecimal;

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

@Controller
public class OrderController
{

    @Autowired
    Ac05Service ac05Service;
    @Autowired
    Ab01Service ab01Service;

    @PostMapping("submitGoodOrder.html")
    @ResponseBody
    public boolean submitGoodOrder(HttpServletRequest request, HttpServletResponse response)
    {
        if (isLogin(request,response))
        {
            String buyerId=getCookies(request,"userId");
            String sellerId="";

            Ac05Dto ac05Dto = new Ac05Dto();
            ac05Dto.setAab101(Integer.parseInt(getCookies(request,"userId")));
            ac05Dto.setAac503(0);
            ac05Dto.setAac504(Integer.parseInt(request.getParameter("aac504")));
            ac05Dto.setAac505(new BigDecimal(request.getParameter("aac505")));
            ac05Dto.setAac506(request.getParameter("aac506"));
            ac05Dto.setAac507(request.getParameter("aac507"));
            ac05Dto.setAac509(request.getParameter("aac509"));
            ac05Dto.setAac510(request.getParameter("aac510"));
            String[] ids = request.getParameter("aac101s").split(",");
            for(String id : ids)
            {
                sellerId=id;
                ac05Service.createGoodOrder(ac05Dto,Integer.parseInt(id));
            }
            return true;
        }
        else
        {
            return false;
        }
    }

}
