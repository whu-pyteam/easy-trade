package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad03;
import com.pyteam.foreground.dto.Ae02Dto;
import com.pyteam.foreground.mapper.Ad01NewMapper;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ae02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wjm
 * @date2019/7/20 8:45
 * 主要是悬赏评价操作
 */
@Controller
public class Ae02Controller
{
    @Autowired
    private Ad01Service ad01Service;
    @Autowired
    private Ae02Service ae02Service;

    Ae02Dto ae02Dto=new Ae02Dto();

    @GetMapping("/ad01/addad03")
    public String mo(@RequestParam("aac502")String aac502,Model m)
    {
        int i=1;
        ae02Dto.setAac502(aac502);
        m.addAttribute("aab101",i);
        return "ad01/addad03";
    }
    @PostMapping("/ad01/addad03")
    public String mo(@ModelAttribute("ad03") Ad03 ad03)
    {
        String aac502=ae02Dto.getAac502();
        ae02Service.insert(ad03,aac502);
        return "/ad01/myComment";
    }

    @GetMapping("/ad01/helpOrder")
    public String mo(Model m)
    {

        int aab101=1;
        m.addAttribute("ac05",ae02Service.queryByAab101(aab101));
        return "ad01/helpOrder";
    }
    @PostMapping("/ad01/helpOrder")
    public String wie(@RequestParam("aac503") String aac503,@RequestParam("aac502")String aac502, String action)
    {
        if(action.equals("确认订单"))
        {
            System.out.println(aac502);
            ae02Service.updateaccpet(aac502);
        }
        else if(action.equals("取消接受"))
        {

        }
        return "ad01/helpOrder";
    }

    @GetMapping("ad01/myComment")
    public String nnc(Model m)
    {
        int i=1;
        m.addAttribute("ad03",ae02Service.qe(i));
        System.out.println(ae02Service.qe(i));
        return "ad01/myComment";
    }

    @PostMapping("ad01/myComment")
    public void ss(@ModelAttribute("ad03")Ad03 ad03,String action)
    {
        if(action.equals("提交修改"))
        {
            System.out.println(ad03);
            ae02Service.update(ad03);
        }
        else if(action.equals("删除评论"))
        {
            int aad301=ad03.getAad301();
            ae02Service.del(aad301);
        }
    }

}
