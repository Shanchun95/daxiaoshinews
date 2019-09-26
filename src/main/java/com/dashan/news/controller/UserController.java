package com.dashan.news.controller;

import com.dashan.news.common.ResponseMap;
import com.dashan.news.pojo.User;
import com.dashan.news.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "用户操作接口")
public class UserController {
    @Autowired
    UserService userService;
    //新增用户信息
    @PostMapping("/addUser")
    public ResponseMap addUser(User user){
        return userService.insert(user);
    }
    //修改用户信息
    @PostMapping("/updateUser")
    public ResponseMap update(User user){
        return userService.update(user);
    }
    //删除用户信息
    @GetMapping("/deleteById")
    public ResponseMap deleteById(User user){
        return userService.delecte(user);
    }
    //查询用户信息
    @GetMapping("/selectUser")
    public ResponseMap select(User user){
        return userService.select(user);
    }
    @GetMapping("/login")
    public ResponseMap login(){
        return userService.login();
    }

}
