package com.pyteam.background.service;

import com.pyteam.background.dto.RewardQueryParam;
import com.pyteam.db.mbg.entity.Ad01;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/13 14:12
 */

public interface RewardService
{
    /**
     * 悬赏分页查询
     * @param queryParam
     * @return
     */
    List<Ad01> list(RewardQueryParam queryParam);


    /**
     * 悬赏单例查询
     * @param id
     * @return
     */
    Ad01 getAd01ByAad101(Integer id);


    /**
     * 更新悬赏审核状态
     * @param id
     * @param status
     * @return
     */
    boolean updateAd01Status(Integer id, String status);
}
