package com.pyteam.background.service;

import com.pyteam.background.dto.FeedbackQueryParam;
import com.pyteam.background.dto.FeedbackUpdateParam;
import com.pyteam.db.mbg.entity.Ab05;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/15 15:42
 */
public interface FeedbackService
{
    /**
     * 反馈分页查询
     * @param queryParam
     * @return
     */
    List<Ab05> list(FeedbackQueryParam queryParam);


    /**
     * 单例查询
     * @param aab501
     * @return
     */
    Ab05 getAb05ByAab501(Integer aab501);


    /**
     * 更新反馈
     * @return
     */
    boolean updateFeedback(Integer id, FeedbackUpdateParam updateParam);
}
