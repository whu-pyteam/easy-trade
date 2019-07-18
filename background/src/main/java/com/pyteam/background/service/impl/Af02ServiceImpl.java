package com.pyteam.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.pyteam.background.dto.StaffLoginParam;
import com.pyteam.background.dto.StaffQueryParam;
import com.pyteam.background.mapper.Af02Af06Mapper;
import com.pyteam.background.service.Af02Service;
import com.pyteam.background.utils.JwtTokenUtil;
import com.pyteam.background.mapper.Af02Af09Mapper;
import com.pyteam.db.mbg.entity.Af02;
import com.pyteam.db.mbg.entity.Af02Example;
import com.pyteam.db.mbg.entity.Af06;
import com.pyteam.db.mbg.entity.Af09;
import com.pyteam.db.mbg.mapper.Af02Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @author tyc
 * @date 2019/7/5 15:02
 */
@Slf4j
@Service
public class Af02ServiceImpl implements Af02Service
{

    private final UserDetailsService userDetailsService;
    private final JwtTokenUtil jwtTokenUtil;
    private final PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    private final Af02Mapper af02Mapper;
    private final Af02Af09Mapper af02Af09Mapper;

    private final Af02Af06Mapper af02Af06Mapper;

    public Af02ServiceImpl(UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil, PasswordEncoder passwordEncoder, Af02Mapper af02Mapper, Af02Af09Mapper af02Af09Mapper, Af02Af06Mapper af02Af06Mapper)
    {
        this.userDetailsService = userDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
        this.passwordEncoder = passwordEncoder;
        this.af02Mapper = af02Mapper;
        this.af02Af09Mapper = af02Af09Mapper;
        this.af02Af06Mapper = af02Af06Mapper;
    }

    @Override
    public List<Af02> list(StaffQueryParam queryParam)
    {
        PageHelper.startPage(queryParam.getPageNum(), queryParam.getPageSize());
        Af02Example af02Example = new Af02Example();
        Af02Example.Criteria criteria1 = af02Example.createCriteria();
        Af02Example.Criteria criteria2 = af02Example.createCriteria();
        Af02Example.Criteria criteria3 = af02Example.createCriteria();

        if(!StringUtils.isEmpty(queryParam.getAaf202()))
        {
            criteria1.andAaf202Like("%" + queryParam.getAaf202() + "%");
        }
        if(!StringUtils.isEmpty(queryParam.getAaf204()))
        {
            criteria2.andAaf204Like("%" + queryParam.getAaf204() + "%");
        }
        if(!StringUtils.isEmpty(queryParam.getAaf207()))
        {
            criteria3.andAaf207EqualTo(queryParam.getAaf207());
        }

        af02Example.or(criteria2);
        af02Example.or(criteria3);

        return af02Mapper.selectByExample(af02Example);
    }

    @Override
    public boolean register(StaffLoginParam loginParam)
    {
        Af02 staff = new Af02();
        staff.setAaf202(loginParam.getUsername());
        staff.setAaf203(loginParam.getPassword());
        staff.setAaf204(loginParam.getUsername());
        staff.setAaf205(new Date());
        staff.setAaf206(new Date());
        // 默认状态未禁用
        staff.setAaf207(0);
        //查询是否有相同用户名的用户
        Af02Example example = new Af02Example();
        example.createCriteria().andAaf202EqualTo(staff.getAaf202());
        List<Af02> staffList = af02Mapper.selectByExample(example);
        if(staffList.size() > 0)
        {
            return false;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(staff.getAaf203());
        staff.setAaf203(encodePassword);
        af02Mapper.insert(staff);
        return true;
    }

    @Override
    public Af02 getEmpByUsername(String username)
    {
        Af02Example example = new Af02Example();
        example.createCriteria().andAaf202EqualTo(username);
        List<Af02> adminList = af02Mapper.selectByExample(example);
        if(adminList != null && adminList.size() > 0)
        {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public Af02 getAf02ById(Integer id)
    {
        return af02Mapper.selectByPrimaryKey(id);
    }


    @Override
    public String login(String username, String password)
    {
        String token = null;
        try
        {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if(!passwordEncoder.matches(password, userDetails.getPassword()))
            {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch(AuthenticationException e)
        {
            log.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }


    @Override
    public List<Af09> getPermissionList(Integer aaf201)
    {
        return af02Af09Mapper.getPermissionList(aaf201);
    }

    @Override
    public int updateInfo(Af02 af02)
    {
        int res = af02Mapper.updateByPrimaryKeySelective(af02);
        return res;
    }

    @Override
    public List<Af06> getRoleList(Integer aaf201)
    {
        return af02Af06Mapper.getRoleListById(aaf201);
    }

}
