package com.pyteam.foreground.service;

import com.pyteam.db.mbg.entity.Ab01;
import com.pyteam.foreground.dto.MemberUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author tyc
 * @date 2019/7/18 15:26
 */
@Service
public class MyUserDetailsService implements UserDetailsService
{
    @Autowired
    Ab01Service ab01Service;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException
    {
        Ab01 ab01 = ab01Service.getMemberByUsername(s);
        if(ab01 == null)
        {
            return null;
        }
        return new MemberUser(ab01.getAab101(), s, ab01.getAab108(), null);
    }
}
