package com.pyteam.foreground.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.db.mbg.entity.Ac04;
import com.pyteam.foreground.dto.Ac04Dto;
import com.pyteam.foreground.dto.CartItemDto;
import com.pyteam.foreground.service.Ac01Service;
import com.pyteam.foreground.service.Ac03Service;
import com.pyteam.foreground.service.Ac04Service;
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
public class CartController
{
    @Autowired
    private Ac04Service ac04Service;
    @Autowired
    private Ac03Service ac03Service;
    @Autowired
    private Ac01Service ac01Service;

    @GetMapping("cart.html")
    public String cartShow(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        //判断用户是否登录
        if (isLogin(request,response))
        {
            model.addAttribute("type",1);
            model.addAttribute("isLogin", isLogin(request, response));
            return "cart";
        } else
        {
            return "error/relogin";
        }
    }

    /**
     * 购物车商品展示
     * @param pageSize
     * @param pageIndex
     * @return Json类型，包含total和rows
     */
    @GetMapping("cartShow.html")
    @ResponseBody
    public JSONObject cartShow(int pageSize,int pageIndex,HttpServletRequest request) throws Exception
    {
        //从cookie中取出用户id
        String username = getCookies(request,"userId");

        //根据用户id获取购物车id
        Integer cartId= ac03Service.getCartIdByUserId(Integer.parseInt(username));

        //获取所有符合条件的商品列表
        List<Ac04> list = ac04Service.getCartItemList(cartId);
        int total=list.size();

        //PageHelper进行分页，获取分页后的当前页面数据
        PageHelper.startPage(pageIndex,pageSize);
        List<Ac04> ac04List = ac04Service.getCartItemList(cartId);

        //通过已经得到的购物车项列表查询商品表获取相关数据,组成最终返回前端的数据列表
        List<CartItemDto> cartItemDtos = new ArrayList<>();
        for (Ac04 item:ac04List)
        {
            int aac101 = item.getAac101();
            Ac01 ac01 = ac01Service.findById(aac101);
            CartItemDto cartItemDto = new CartItemDto();
            cartItemDto.setAac101(ac01.getAac101());
            cartItemDto.setAac102(ac01.getAac102());
            cartItemDto.setAac105(ac01.getAac105());
            cartItemDto.setAac106(ac01.getAac106());
            cartItemDtos.add(cartItemDto);
        }

        JSONObject json=new JSONObject();
        json.put("total",total);
        json.put("rows",cartItemDtos);
        return json;
    }

    /**
     * 商品加入购物车
     * @param id
     * @param request
     * @return 0-用户未登录 1-成功加入购物车 2-未创建购物车 3-购物车商品已存在
     * @throws Exception
     */
    @PostMapping("addToCart.html")
    @ResponseBody
    public int addToCart(int id,HttpServletRequest request,HttpServletResponse response) throws Exception
    {
        //判断用户是否登录
        if (isLogin(request,response))
        {
            String username = getCookies(request,"userId");

            //根据用户id获取购物车id
            Integer cartId= ac03Service.getCartIdByUserId(Integer.parseInt(username));

            if(cartId == null)
            {
                System.out.println("没有为用户创建购物车");
                return 2;
            }

            if(ac04Service.isExist(cartId,id))
            {
                return 3;
            }

            Ac04Dto ac04Dto = new Ac04Dto();
            ac04Dto.setAac301(cartId);
            ac04Dto.setAac101(id);
            ac04Service.addToCart(ac04Dto);
            return 1;
        }
        else
        {
            return 0;
        }
    }

    /**
     * 删除单一购物车商品
     * @param id
     * @return
     */
    @DeleteMapping("cartItemDelete.html")
    @ResponseBody
    public int cartItemDelete(int id,HttpServletRequest request,HttpServletResponse response)throws Exception
    {
        if (isLogin(request,response))
        {
            String username = getCookies(request,"userId");

            //根据用户id获取购物车id
            Integer cartId= ac03Service.getCartIdByUserId(Integer.parseInt(username));
            int res = ac04Service.deleteFromCart(id,cartId);
            if(res==1)
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        else
        {
            return 0;
        }
    }

    /**
     * 批量删除购物车商品
     * @param ids
     * @return
     */
    @PostMapping("patchDelete.html")
    @ResponseBody
    public int patchDelete(@RequestParam(value = "ids")String ids,HttpServletRequest request,HttpServletResponse response)throws Exception
    {
        if (isLogin(request,response))
        {
            String username = getCookies(request,"userId");

            //根据用户id获取购物车id
            Integer cartId= ac03Service.getCartIdByUserId(Integer.parseInt(username));

            String[] idArray = ids.split(",");
            if(ac04Service.patchDelete(idArray,cartId))
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        else
        {
            return 0;
        }
    }
}
