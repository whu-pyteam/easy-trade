package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.entity.Ae04;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ad04Service;
import com.pyteam.foreground.service.Ae04Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 9:05
 */
@Controller
public class Ad04Controller
{
    @Autowired
    private Ad04Service ad04Service;

    @Autowired
    private Ad01Service ad01Service;
    @Autowired
    private Ae04Service ae04Service;

    //悬赏首页显示

    @GetMapping("ad01list.html")
    public String Show(Model m)
    {
        m.addAttribute("ad01",ad01Service.listByAll());
        return "ad01list";
    }

    @GetMapping("ad01list")
    public String Showagain(Model m)
    {
        m.addAttribute("ad01",ad01Service.listByAll());
        return "ad01list";
    }

    @PostMapping("ad01list")
    public void viewad01list(@RequestParam(value = "aad101",required = false)int aad101,@RequestParam(value = "aab101",required = false)int aab101)
    {
        List<Ad04> ad04s=ad04Service.query(aab101);
        Ad01 ad01=new Ad01();
        ad01.setAab101(aab101);
        ad01.setAad101(aad101);
        if(ad04s.size()==0)
        {
            ad04Service.add(ad01);
        }
        Ad04 ad04= ad04s.get(0);
        System.out.println(ad04);
        Ae04 ae04=new Ae04();
        ae04.setAad101(ad01.getAad101());
        ae04.setAad401(ad04.getAad401());
        Ae04 testae04=ae04Service.select(ae04);
        if(testae04==null)
        {
            ae04Service.add(ae04);
        }

    }
    @ResponseBody
    @RequestMapping(value = "ad01/fork" ,method =RequestMethod.GET)
    public void view(@RequestParam(value = "aad101",required = false)int aad101,@RequestParam(value = "aab101",required = false)int aab101)
    {
        List<Ad04> ad04s=ad04Service.query(aab101);
        Ad01 ad01=new Ad01();
        ad01.setAab101(aab101);
        ad01.setAad101(aad101);
        if(ad04s.size()==0)
        {
            ad04Service.add(ad01);
        }
        Ad04 ad04= ad04s.get(0);
        System.out.println(ad04);
        Ae04 ae04=new Ae04();
        ae04.setAad101(ad01.getAad101());
        ae04.setAad401(ad04.getAad401());
        Ae04 testae04=ae04Service.select(ae04);
        if(testae04==null)
        {
            ae04Service.add(ae04);
        }

    }

    @GetMapping("ad01/forklist")
    public String viewforklist(Model m)
    {
        //使用用户id 得到收藏
        List<Ad04> ad04 = ad04Service.query(1);
        //得到收藏号id
        int id = ad04.get(0).getAad401();

        //悬赏单号集合
        List<Ae04> ae04s = ae04Service.query(id);
        //循环次数
        int count = ae04Service.count(id);


        List<Ad01> ad01s1 = new ArrayList<>();
        List<Ad01> ad01s = null;
        for (int i = 0; i < count; i++)
        {
            int aad101 = ae04s.get(i).getAad101();
            System.out.println(aad101);
            ad01s=ad01Service.selectById(aad101);
            System.out.println(ad01s.toString());
            System.out.println(ad01s.get(0).toString());
            Ad01 ad011=ad01s.get(0);
            ad01s1.add(ad011);

        }
        m.addAttribute("ad01",ad01s1);
        return "ad01/forklist";
    }

    @RequestMapping("ad01/forkCancel")
    public String viewforklist(@RequestParam(value = "aad101",required = false)Integer aad101, Session session)
    {
        int aab101=1;
        int aad401=ad04Service.query(aab101).get(0).getAad401();
        Ae04 ae04=new Ae04();
        ae04.setAad401(aad401);
        ae04.setAad101(aad101);
        ae04Service.delete(ae04);
        return "ad01/forklist";
    }
}
