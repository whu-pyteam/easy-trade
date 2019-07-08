package com.pyteam.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.pyteam.background.dto.StaffLoginParam;
import com.pyteam.background.service.Af02Service;
import com.pyteam.background.utils.JwtTokenUtil;
import com.pyteam.background.mapper.Af02Af09Mapper;
import com.pyteam.db.mbg.entity.Af02;
import com.pyteam.db.mbg.entity.Af02Example;
import com.pyteam.db.mbg.entity.Af09;
import com.pyteam.db.mbg.mapper.Af02Mapper;
import lombok.Data;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private Af02Mapper af02Mapper;
    @Autowired
    private Af02Af09Mapper af02Af09Mapper;

    @Override
    public List<Af02> list(String name, Integer pageSize, Integer pageNum)
    {
        PageHelper.startPage(pageNum, pageSize);
        Af02Example af02Example = new Af02Example();
        Af02Example.Criteria criteria = af02Example.createCriteria();
        if(!StringUtils.isEmpty(name))
        {
            criteria.andAaf202Like("%" + name + "%");
            af02Example.or(af02Example.createCriteria().andAaf204Like("%" + name + "%"));
        }
        return af02Mapper.selectByExample(af02Example);
    }

    @Override
    public Af02 register(StaffLoginParam loginParam)
    {
        Af02 staff = new Af02();
        staff.setAaf202(loginParam.getUsername());
        staff.setAaf203(loginParam.getPassword());
        staff.setAaf204("admin");
        staff.setAaf205(new Date());
        staff.setAaf206(new Date());
        staff.setAaf207(1);
        //查询是否有相同用户名的用户
        Af02Example example = new Af02Example();
        example.createCriteria().andAaf202EqualTo(staff.getAaf202());
        List<Af02> staffList = af02Mapper.selectByExample(example);
        if (staffList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(staff.getAaf203());
        staff.setAaf203(encodePassword);
        af02Mapper.insert(staff);
        return staff;
    }

    @Override
    public Af02 getEmpByUsername(String username) {
        Af02Example example = new Af02Example();
        example.createCriteria().andAaf202EqualTo(username);
        List<Af02> adminList = af02Mapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }


    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            log.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }


    @Override
    public List<Af09> getPermissionList(Integer aaf201) {
        return af02Af09Mapper.getPermissionList(aaf201);
    }

}
