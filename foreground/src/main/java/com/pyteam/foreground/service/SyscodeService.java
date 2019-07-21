package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Syscode;
import com.pyteam.db.mbg.mapper.SyscodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyscodeService
{
    @Autowired
    private SyscodeMapper syscodeMapper;

    public String getSchoolName(Integer syscodeid)
    {
        Syscode syscode = syscodeMapper.selectByPrimaryKey(syscodeid);
        return syscode.getIdname();
    }
}
