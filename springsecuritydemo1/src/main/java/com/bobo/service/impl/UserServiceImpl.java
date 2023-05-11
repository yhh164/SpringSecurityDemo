package com.bobo.service.impl;

import com.bobo.dao.UserMapper;
import com.bobo.pojo.SysUser;
import com.bobo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yahuihui
 * @Date: 2023/5/10 15 39
 * @Description：com.bobo.service.impl
 * @version：1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SysUser sysUser = userMapper.queryByUserName(userName);
        if (sysUser !=null){
            List<GrantedAuthority> list=new ArrayList<>();
            GrantedAuthority user_role = new SimpleGrantedAuthority("ROLE_USER");
            GrantedAuthority user_role１ = new SimpleGrantedAuthority("ROLE_ADMIN");

            list.add(user_role);
            list.add(user_role１);
            /*UserDetails userDetails= new User(sysUser.getUserName(),
//                    "{noop}"+sysUser.getPassword(),
                    sysUser.getPassword(),
                    list);*/
            UserDetails userDetails=new User(sysUser.getUserName(),sysUser.getPassword(),true,true,true,true,list);
            return userDetails;
        }
        return null;
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("admin"));
        System.out.println(bCryptPasswordEncoder.encode("admin"));
        System.out.println(bCryptPasswordEncoder.encode("admin"));
    }
}
