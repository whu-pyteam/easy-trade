package com.pyteam.background.service;

import com.pyteam.background.dto.StaffLoginParam;
import com.pyteam.background.dto.StaffQueryParam;
import com.pyteam.db.mbg.entity.Af02;
import com.pyteam.db.mbg.entity.Af06;
import com.pyteam.db.mbg.entity.Af09;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台员工 service
 * @author tyc
 * @date 2019/7/5 14:13
 */

public interface Af02Service
{
    /**
     * 根据用户名或昵称分页查询用户
     * @param
     * @return
     */
    List<Af02> list(StaffQueryParam queryParam);


    /**
     * @param id
     * @return
     */
    Af02 getAf02ById(Integer id);
    /**
     * 注册
     * @param loginParam
     * @return
     */
    boolean register(StaffLoginParam loginParam);

    /**
     * 通过用户名获取员工
     * @param username 用户名
     * @return 员工
     */
    Af02 getEmpByUsername(String username);

    /**
     * 通过用户名, 密码登录
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 获取权限列表
     * @param aaf201 员工id
     * @return 权限列表
     */
    List<Af09> getPermissionList(Integer aaf201);

    /**
     * 更新用户信息
     * @param af02
     * @return
     */
    int updateInfo(Af02 af02);

    /**
     * 查询特定用户的角色列表
     * @param aaf201
     * @return
     */
    List<Af06> getRoleList(Integer aaf201);
}
