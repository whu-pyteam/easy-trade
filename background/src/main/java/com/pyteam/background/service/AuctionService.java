package com.pyteam.background.service;

import com.pyteam.background.dto.AuctionQueryParam;
import com.pyteam.db.mbg.entity.Ad02;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/15 8:57
 */
public interface AuctionService
{

    /**
     * 拍卖分页查询
     * @param queryParam
     * @return
     */
    List<Ad02> list(AuctionQueryParam queryParam);


    /**
     * 拍卖单例查询
     * @param aad201
     * @return
     */
    Ad02 getAuctionByAad201(Integer aad201);


    /**
     * 拍卖审核更新
     * @param aad201
     * @param aad209
     * @return
     */
    boolean updateAuction(Integer aad201, String aad209);
}
