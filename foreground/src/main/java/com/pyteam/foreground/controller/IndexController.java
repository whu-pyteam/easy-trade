package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.foreground.dto.Ac01Dto;
import com.pyteam.foreground.service.Ab01Service;
import com.pyteam.foreground.service.Ac01Service;
import com.pyteam.foreground.service.Ac02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import static com.pyteam.foreground.controller.LoginController.isLogin;
import static com.pyteam.foreground.controller.LoginController.getCookies;

@Controller
public class IndexController
{
    @Autowired
    private Ac01Service ac01Service;
    @Autowired
    private Ac02Service ac02Service;
    @Autowired
    private Ab01Service ab01Service;

    /**
     * 返回主页
     * @param model
     * @return
     */
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String wel(Model model)
    {
        try
        {
            model.addAttribute("type", 1);
            model.addAttribute("ac01List", ac01Service.getUnsoldGoodList());
            return "index";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

    /**
     * 商品详情
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="goodShow.html",method=RequestMethod.GET)
    public String searchById(int id, Model model)
    {
        try
        {
            Ac01 ac01=ac01Service.findById(id);
            model.addAttribute("ac01", ac01);

            String name=ac02Service.getName(ac01.getAac201());

            Ab01 ab01=ab01Service.getMemberInfo(ac01.getAab101());
            model.addAttribute("aab103",ab01.getAab103());
            model.addAttribute("aac202",name);
            model.addAttribute("type", 1);
            return "goodShow";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

    /**
     * 商品搜索
     * @param value
     * @param model
     * @return
     */
    @RequestMapping(value = "/goodSearch.html", method = RequestMethod.POST)
    public String searchByValue(@RequestParam(value = "searchValue") String value, Model model)
    {
        System.out.println(value);
        try
        {
            model.addAttribute("searchList", ac01Service.searchByValue(value));
            model.addAttribute("type", 1);
            return "goodSearch";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }


    /**
     * 添加商品页面
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/goodLaunch.html", method = RequestMethod.GET)
    public String add(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception
    {
        if (isLogin(request,response))
        {
            model.addAttribute("type","1");
            return "goodLaunch";
        } else
        {
            return "error/relogin";
        }
    }

    /**
     * 提交添加商品表单
     * @param dto
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/goodSubmit.html", method = RequestMethod.POST)
    public String goodSubmit(Ac01Dto dto,Model model,HttpServletRequest request,HttpServletResponse response) throws Exception
    {
        if (isLogin(request,response))
        {
            dto.setAab101(Integer.parseInt(getCookies(request,"username")));
            try
            {
                boolean res = ac01Service.addAc01(dto);
                if(res)
                {
                    model.addAttribute("type", 1);
                    model.addAttribute("ac01List", ac01Service.selectById());
                    return "index";
                }
                else
                {
                    return "error/404";
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return "error/404";
            }
        }
        else
        {
            return "error/relogin";
        }
    }

    /**
     * 根据分类号获取该分类及子分类所有商品
     * @param sortId 分类id
     * @param model
     * @return
     */
    @GetMapping("sort.html")
    public String  getGoodByCategory(int sortId,Model model)
    {
        //定义返回的商品list容器
        List<Ac01> goodList=new ArrayList<>();

        //获取所有子类id
        List <Integer> allIds = ac02Service.getChildIds(sortId);

        //在List中加入父类id
        allIds.add(sortId);

        for(Integer integer: allIds)
        {
            //根据List中的所有分类id取出对应的商品
            List<Ac01> ac01List=ac01Service.getByCategory(integer);
            for(Ac01 ac01:ac01List)
            {
                goodList.add(ac01);
            }
        }

        try
        {
            model.addAttribute("type", 1);
            model.addAttribute("ac01List", goodList);
            return "index";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

}
