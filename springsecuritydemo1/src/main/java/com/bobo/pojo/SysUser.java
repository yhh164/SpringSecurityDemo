package com.bobo.pojo;

import lombok.Data;

/**
 * @author: yahuihui
 * @Date: 2023/5/10 14 59
 * @Description：com.bobo.pojo
 * @version：1.0
 */
@Data
public class SysUser {
    private Integer id;
   private String userName;
   private String password;
   private String salt;

}
