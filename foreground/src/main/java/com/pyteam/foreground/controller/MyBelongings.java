package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.db.mbg.entity.Ac01;
import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ad03;
import com.pyteam.foreground.service.Ab01Service;
import com.pyteam.foreground.service.Ac01Service;
import com.pyteam.foreground.service.Ac05Service;
import com.pyteam.foreground.service.Ad03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

@Controller
public class MyBelongings
{

    @Autowired
    private Ac01Service ac01Service;
    @Autowired
    private Ac05Service ac05Service;
    @Autowired
    private Ad03Service ad03Service;
    @Autowired
    private Ab01Service ab01Service;

    @GetMapping("myGood.html")
    public String myGood(Model model, HttpServletRequest request, HttpServletResponse response)
    {
        //判断用户是否登录
        if (isLogin(request,response))
        {
            String username = getCookies(request,"userId");

            List<Ac01> ac01List = ac01Service.getByOwner(Integer.parseInt(username));
            model.addAttribute("ac01List",ac01List);
            model.addAttribute("isLogin", isLogin(request, response));
            return "myGood";
        }
        else
        {
            return "error/relogin";
        }
    }


    @GetMapping("myPurchase.html")
    public String myPurchase(Model model, HttpServletRequest request, HttpServletResponse response)
    {
        //判断用户是否登录
        if (isLogin(request,response))
        {
            String username = getCookies(request,"userId");

            List<Ac01> ac01List = ac05Service.getByOrder(Integer.parseInt(username));
            model.addAttribute("ac01List",ac01List);
            model.addAttribute("isLogin", isLogin(request, response));
            return "myPurchase";
        }
        else
        {
            return "error/relogin";
        }
    }



    @PostMapping("sellerAndBuyer.html")
    @ResponseBody
    public String sellerAndBuyer(HttpServletRequest request,HttpServletResponse response)throws Exception
    {
        String aac101 = request.getParameter("productId");
        Ac01 ac01 = ac01Service.findById(Integer.parseInt(aac101));
        String sellerId = ac01.getAab101().toString();

        Ac05 ac05 = ac05Service.getBuyerId(Integer.parseInt(aac101));
        String buyerId="";
        String orderState="";
        String buyerhasComment="0";
        String sellerhasComment="0";
        String buyerComment="";
        String sellerComment="";
        String buyerStar="";
        String sellerStar="";
        String buyerName="";
        String sellerName="";
        String buyerImg="";
        String sellerImg="";

        Ab01 seller=ab01Service.getMemberInfo(ac01.getAab101());
        sellerName=seller.getAab103();
        sellerImg=seller.getAab107();
        if(ac05!=null)
        {
            buyerId=ac05.getAab101().toString();

            Ab01 buyer=ab01Service.getMemberInfo(ac05.getAab101());
            buyerName=buyer.getAab103();
            buyerImg=buyer.getAab107();

            orderState=ac05.getAac503().toString();
        }

        List<Ad03> ids = ad03Service.hasCommend(Integer.parseInt(aac101));
        for(int i=0;i<ids.size();i++)
        {
            if(ids.get(i).getAab101().equals(ac05.getAab101()))
            {
                buyerhasComment="1";
                buyerComment=ids.get(i).getAad303();
                buyerStar=ids.get(i).getAad304();
            }
            else
            {
                sellerhasComment="1";
                sellerComment=ids.get(i).getAad303();
                sellerStar=ids.get(i).getAad304();
            }
        }

        return sellerId+"&!"+buyerId+"&!"+orderState+"&!"+buyerhasComment+"&!"+sellerhasComment+"&!"+buyerComment+"&!"+sellerComment+"&!"+buyerStar+"&!"+sellerStar+"&!"+buyerName+"&!"+sellerName+"&!"+buyerImg+"&!"+sellerImg;
    }

    @PostMapping("deleteGood.html")
    @ResponseBody
    public boolean deleteGood(Integer id)
    {
        if(ac01Service.deleteGood(id))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @PostMapping("sendGood.html")
    @ResponseBody
    public boolean sendGood(Integer id)
    {
        if(ac05Service.sendGood(id))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @PostMapping("receiveGood.html")
    @ResponseBody
    public boolean receiveGood(Integer id)
    {
        if(ac05Service.receiveGood(id))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
