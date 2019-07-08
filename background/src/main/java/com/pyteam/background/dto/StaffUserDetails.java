package com.pyteam.background.dto;

import com.pyteam.db.mbg.entity.Af02;
import com.pyteam.db.mbg.entity.Af09;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tyc
 * @date 2019/7/5 14:18
 */
public class StaffUserDetails implements UserDetails
{
    /**
     * 员工
     */
    private Af02 af02;

    private List<Af09> permissionList;


    public StaffUserDetails(Af02 af02, List<Af09> permissionList)
    {
        this.af02 = af02;
        this.permissionList = permissionList;
    }

    /**
     * 返回员工权限
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return permissionList.stream()
                .filter(permission -> permission.getAaf902() != null)
                .map(permission -> new SimpleGrantedAuthority(permission.getAaf902()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword()
    {
        return af02.getAaf203();
    }

    @Override
    public String getUsername()
    {
        return af02.getAaf202();
    }

    @Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    @Override
    public boolean isEnabled()
    {
        return af02.getAaf207().equals(1);
    }
}
