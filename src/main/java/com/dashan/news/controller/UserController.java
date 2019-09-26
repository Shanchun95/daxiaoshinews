package com.dashan.news.controller;

import com.dashan.news.common.ResponseMap;
import com.dashan.news.pojo.User;
import com.dashan.news.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(value = "用户操作接口")
public class UserController {
    @Autowired
    UserService userService;
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
    public ResponseMap select(@ApiParam(name = "用户id",required = true)
                              @RequestParam(value = "userId",required = true) int userId)
    {
        User user = new User();
        user.setUserId(userId);
        return userService.select(user);
    }
    @GetMapping("/login")
    public ResponseMap login(){
        return userService.login();
    }
}
