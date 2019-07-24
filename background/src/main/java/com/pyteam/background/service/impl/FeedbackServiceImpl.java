package com.pyteam.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.pyteam.background.dto.FeedbackQueryParam;
import com.pyteam.background.dto.FeedbackUpdateParam;
import com.pyteam.background.service.FeedbackService;
import com.pyteam.db.mbg.entity.Ab05;
import com.pyteam.db.mbg.entity.Ab05Example;
import com.pyteam.db.mbg.mapper.Ab05Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/15 15:51
 */
@Service
public class FeedbackServiceImpl implements FeedbackService
{

    private final
    Ab05Mapper ab05Mapper;

    public FeedbackServiceImpl(Ab05Mapper ab05Mapper)
    {
        this.ab05Mapper = ab05Mapper;
    }

    @Override
    public List<Ab05> list(FeedbackQueryParam queryParam)
    {
        PageHelper.startPage(queryParam.getPageNum(), queryParam.getPageSize());
        Ab05Example example = new Ab05Example();
        Ab05Example.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(queryParam.getAab503()))
        {
            criteria.andAab503Like("%" + queryParam.getAab503() + "%");
        }
        if(!StringUtils.isEmpty(queryParam.getAab504()))
        {
            criteria.andAab504EqualTo((queryParam.getAab504()));
        }

        return ab05Mapper.selectByExample(example);
    }

    @Override
    public Ab05 getAb05ByAab501(Integer aab501)
    {
        return ab05Mapper.selectByPrimaryKey(aab501);
    }

    @Override
    public boolean updateFeedback(Integer id, FeedbackUpdateParam updateParam)
    {
        Ab05 ab05 = new Ab05();
        ab05.setAab501(id);
        ab05.setAab504(updateParam.getStatus());
        ab05.setAab506(updateParam.getReply());
        int i = ab05Mapper.updateByPrimaryKeySelective(ab05);
        return i ==1 ;
    }
}
