package com.bobo.dao;

import com.bobo.pojo.SysUser;

/**
 * @author: yahuihui
 * @Date: 2023/5/10 15 18
 * @Description：com.bobo.dao
 * @version：1.0
 */
public interface UserMapper {
    public SysUser queryByUserName(String userName);
}
