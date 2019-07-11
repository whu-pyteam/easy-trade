package com.pyteam.background.service;

import com.pyteam.background.dto.StaffRoleParam;

/**
 * @author tyc
 * @date 2019/7/11 10:24
 */
public interface Af07Service
{
    /**
     * 给用户添加角色
     * @param staffRoleParam
     * @return
     */
    boolean staffRoleRelation(StaffRoleParam staffRoleParam);
}
