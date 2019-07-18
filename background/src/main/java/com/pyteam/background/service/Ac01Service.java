package com.pyteam.background.service;

import com.pyteam.background.dto.ProductQueryParam;
import com.pyteam.db.mbg.entity.Ac01;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/12 11:18
 */
public interface Ac01Service
{
    /**
     * 分页查询
     * @param queryParam
     * @return
     */
    List<Ac01> getAc01List(ProductQueryParam queryParam);

    /**
     * 单例查询
     * @param id
     * @return
     */
    Ac01 getAc01(Integer id);

    Boolean updateAc01(Integer id, String status);

}
