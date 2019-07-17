package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ad01;
import com.pyteam.db.mbg.entity.Ad04;
import com.pyteam.db.mbg.entity.Ae04;
import com.pyteam.foreground.mapper.Ae04NewMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjm
 * @date2019/7/12 10:12
 */
@Service
public class Ae04ServiceImpl implements Ae04Service
{
    @Autowired
    private Ae04NewMapper ae04NewMapper;

    @Override
    public void add(Ae04 ae04)
    {
        ae04NewMapper.addae04(ae04);
    }


    @Override
    public List<Ae04> query(int id)
    {
        return ae04NewMapper.query(id);
    }

    //根据收藏流水号查总数

    @Override
    public int count(int id)
    {
        return ae04NewMapper.count(id);
    }

    //根据收藏流水id 和 悬赏id删除 悬赏收藏关联项

    @Override
    public void delete(Ae04 ae04)
    {
        ae04NewMapper.delete(ae04);
    }

    @Override
    public Ae04 select(Ae04 ae04)
    {
       return ae04NewMapper.select(ae04);
    }
}
