package com.bobo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;


/**
 * @author: yahuihui
 * @Date: 2023/5/10 18 18
 * @Description：com.bobo.controller
 * @version：1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RolesAllowed("ROLE_USER")
    @RequestMapping("/query")
    public String query(){
        System.out.println("用户查询....");
        return "/home.jsp";
    }
    @RolesAllowed("ROLE_ADMIN")
    @RequestMapping("/delete")
    public String delete(){
        System.out.println("用户删除....");
        return "/home.jsp";
    }
    @RequestMapping("/update")
    public String update(){
        System.out.println("用户更新....");
        return "/home.jsp";
    }


//    @PreAuthorize(
//            value = "hasAnyRole('USER_ADMIN')")
//    @RequestMapping("/query1")
//    public String query1(){
//        System.out.println("用户查询....");
//        return "/home.jsp";
//    }
//    @PreAuthorize(
//            value = "hasRole('ROLE_USER')")
//    @RequestMapping("/delete1")
//    public String delete1(){
//        System.out.println("用户删除....");
//        return "/home.jsp";
//    }
//    @RequestMapping("/update1")
//    public String update1(){
//        System.out.println("用户更新....");
//        return "/home.jsp";
//    }



//    @Secured("ROLE_ADMIN")
    @RequestMapping("/query1")
    public String query1(){
        System.out.println("用户查询....");
        return "/home.jsp";
    }

    @RequestMapping("/delete1")
    public String delete1(){
        System.out.println("用户删除....");
        return "/home.jsp";
    }
//    @Secured("ROLE_USER")
    @RequestMapping("/update1")
    public String update1(){
        System.out.println("用户更新....");
        return "/home.jsp";
    }
}
