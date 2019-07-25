package com.pyteam.foreground.controller;

import com.github.pagehelper.PageHelper;
import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.foreground.dto.Ab05Dto;
import com.pyteam.foreground.dto.Ac01Dto;
import com.pyteam.foreground.service.Ab01Service;
import com.pyteam.foreground.service.Ab05Service;
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
    @Autowired
    private Ab05Service ab05Service;


    @RequestMapping(value = "/template.html", method = RequestMethod.GET)
    public String template()
    {
        return "template";
    }

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String getIndexPage(HttpServletRequest request, HttpServletResponse response, Model model,int pageIndex)throws Exception
    {
        List<Ac01> totalList=ac01Service.selectById();
        int total=totalList.size();

        PageHelper.startPage(pageIndex,9);
        List<Ac01> ac01List=ac01Service.selectById();

        List<Ac01> newList = new ArrayList<>();
        if(total>0)
        {
            newList.add(totalList.get(totalList.size()-1));
            if(total>1)
            {
                newList.add(totalList.get(totalList.size() - 2));
                if(total>2)
                {
                    newList.add(totalList.get(totalList.size() - 3));
                }
            }
        }

        model.addAttribute("total",total);
        model.addAttribute("pageIndex",pageIndex);
        model.addAttribute("ac01List", ac01List);
        model.addAttribute("isLogin", isLogin(request, response));
        model.addAttribute("newList",newList);
        return "index";
    }

    /**
     * 商品详情
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="goodShow.html",method=RequestMethod.GET)
    public String searchById(int id, Model model,HttpServletRequest request,HttpServletResponse response)
    {
        try
        {
            Ac01 ac01 = ac01Service.findById(id);
            model.addAttribute("ac01", ac01);

            String name = ac02Service.getName(ac01.getAac201());

            Ab01 ab01 = ab01Service.getMemberInfo(ac01.getAab101());
            model.addAttribute("aab103", ab01.getAab103());
            model.addAttribute("aab111", ab01.getAab111());
            model.addAttribute("aac202", name);
            model.addAttribute("type", 1);

            if(isLogin(request,response))
            {
                String username = getCookies(request,"userId");
                Ab01 ab011=ab01Service.getMemberInfo(Integer.parseInt(username));
                model.addAttribute("aab107", ab011.getAab107());
            }

            model.addAttribute("isLogin", isLogin(request, response));


            return "goodShow";
        } catch (Exception e)
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

    @GetMapping(value = "/goodSearch.html")
    public String searchByVal(@RequestParam(value = "searchValue") String value,@RequestParam(value = "pageIndex")int pageIndex, Model model,HttpServletRequest request,HttpServletResponse response)
    {
        try
        {
            List<Ac01> totalList=ac01Service.searchByValue(value);
            int total=totalList.size();

            PageHelper.startPage(pageIndex,9);
            List<Ac01> ac01List=ac01Service.searchByValue(value);

            model.addAttribute("ac01List", ac01List);
            model.addAttribute("total",total);
            model.addAttribute("searchValue",value);
            model.addAttribute("type", 1);
            model.addAttribute("pageIndex",pageIndex);
            model.addAttribute("isLogin", isLogin(request, response));
            return "goodSearch";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

    @GetMapping("searchByPrice.html")
    public String searchByPrice(@RequestParam(value = "maxprice") String maxp,@RequestParam(value = "minprice") String minp,@RequestParam(value = "pageIndex")int pageIndex, Model model,HttpServletRequest request,HttpServletResponse response)
    {
        try
        {
            List<Ac01> totalList=ac01Service.searchByPrice(Integer.parseInt(maxp),Integer.parseInt(minp));
            int total=totalList.size();

            PageHelper.startPage(pageIndex,9);
            List<Ac01> ac01List=ac01Service.searchByPrice(Integer.parseInt(maxp),Integer.parseInt(minp));

            model.addAttribute("ac01List", ac01List);
            model.addAttribute("total",total);
            model.addAttribute("maxprice",maxp);
            model.addAttribute("minprice",minp);
            model.addAttribute("type", 1);
            model.addAttribute("pageIndex",pageIndex);
            model.addAttribute("isLogin", isLogin(request, response));
            return "goodSearchByPrice";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

    @GetMapping("searchByType.html")
    public String searchByType(@RequestParam(value = "types") String types,@RequestParam(value = "pageIndex")int pageIndex, Model model,HttpServletRequest request,HttpServletResponse response)
    {
        try
        {
            String[] typeArr=types.split(",");
            List<Ac01> totalList=ac01Service.searchByTypes(typeArr);
            int total=totalList.size();

            //PageHelper.startPage(pageIndex,9);
            List<Ac01> ac01List=ac01Service.searchByTypes(typeArr);
            List<Ac01> newList=ac01Service.pageClip(total,pageIndex,9,ac01List);


            model.addAttribute("ac01List", newList);
            model.addAttribute("total",total);
            model.addAttribute("types",types);
            model.addAttribute("type", 1);
            model.addAttribute("pageIndex",pageIndex);
            model.addAttribute("isLogin", isLogin(request, response));
            return "goodSearchByType";
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
            model.addAttribute("isLogin", isLogin(request, response));
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
            dto.setAab101(Integer.parseInt(getCookies(request,"userId")));
            try
            {
                boolean res = ac01Service.addAc01(dto);
                if(res)
                {
                    model.addAttribute("type", 1);
                    model.addAttribute("ac01List", ac01Service.selectById());
                    model.addAttribute("isLogin", isLogin(request, response));
                    return "goodLaunch";
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
    public String  getGoodByCategory(int sortId,Model model,HttpServletRequest request,HttpServletResponse response)
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
            model.addAttribute("isLogin", isLogin(request, response));
            return "index";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

    @GetMapping("reflectShow.html")
    public String reflectShow(Model model,HttpServletRequest request,HttpServletResponse response)
    {
        if (isLogin(request,response))
        {
            model.addAttribute("type", 1);
            model.addAttribute("isLogin", isLogin(request, response));
            return "reflect";
        }
        else
        {
            return "error/relogin";
        }
    }

    @PostMapping("reflectSubmit.html")
    @ResponseBody
    public boolean reflectSubmit(Ab05Dto ab05Dto, Model model, HttpServletRequest request, HttpServletResponse response)
    {
        if(isLogin(request,response))
        {
            String aab101=getCookies(request,"userId");
            ab05Dto.setAab101(Integer.parseInt(aab101));
            ab05Service.addReflect(ab05Dto);
            return true;
        }
        else
        {
            return false;
        }
    }
}
