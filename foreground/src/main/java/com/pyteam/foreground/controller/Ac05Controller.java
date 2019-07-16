package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.foreground.service.Ac05Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    @PostMapping("orderAdd")
    public String view(@ModelAttribute("ac05")Ac05 ac05)
    {
        Date date= ac05.getAac511();
        SimpleDateFormat sd1= new SimpleDateFormat("yyyyMMddHH");
        String before=sd1.format(date);
        System.out.println(before);
        int aab101=ac05.getAab101();
        String aac502;
        int count;
        do
        {
            Integer after = (int) ((Math.random() * 9 + 1) * 10);
            StringBuilder a = new StringBuilder();
            a.append(aab101).append(before).append(after);
            aac502 = a.toString();
            System.out.println(aac502);
            count=ac05Service.count(aac502);
        }
        while(count==1);

        ac05.setAac502(aac502);
        ac05Service.add(ac05);
        System.out.println("插入成功");
        return "orderAdd";
    }
    @GetMapping("orderAdd")
    public String view()
    {
        return "orderAdd";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        //true:允许为空, false:不允许为空
    }
}
