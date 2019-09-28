package com.dashan.news.controller;

import com.dashan.news.common.ResponseMap;

import com.dashan.news.po.user.User;
import com.dashan.news.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/user")
@Api(value = "用户操作接口")

public class UserController {

    @Resource
    UserService userService;

    //<editor-fold desc="Description">
    @ExceptionHandler({Exception.class})
    @ApiOperation(value = "新增用户", notes = "将用户信息添加导数据库")
    @PostMapping("/addUser")
    public ResponseMap addUser(
            @ApiParam(name = "用户id", required = true)
            @RequestParam(value = "userId", required = true) int userId,
            @ApiParam(name = "用户name", required = true)
            @RequestParam(value = "userName", required = true) String userName,
            @ApiParam(name = "用户email", required = true)
            @RequestParam(value = "email", required = true) String email,
            @ApiParam(name = "用户账户密码", required = true)
            @RequestParam(name = "password", required = true) String password) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserName(email);
        user.setPassword(password);
        return userService.insert(user);

    }

    //</editor-fold>
    @ApiOperation(value = "修改用户信息", notes = "修改用户字段信息")
    @PostMapping("/updateUser")
    public ResponseMap update(
            @ApiParam(name = "用户id", required = true)
            @RequestParam(value = "userId", required = true) int userId,
            @ApiParam(name = "用户name", required = true)
            @RequestParam(value = "userName", required = true) String userName,
            @ApiParam(name = "用户email", required = true)
            @RequestParam(value = "email", required = true) String email,
            @ApiParam(name = "用户账户密码", required = true)
            @RequestParam(name = "password", required = true) String password) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserName(email);
        user.setPassword(password);
        return userService.update(user);
    }

    @ApiOperation(value = "删除用户信息", notes = "通过用户id删除用户信息")
    @GetMapping("/deleteById")
    public ResponseMap deleteById(
            @ApiParam(name = "用户id", required = true)
            @RequestParam(value = "userId", required = true) int userId) {
        User user = new User();
        user.setUserId(userId);
        return userService.delecte(user);
    }

    @ApiOperation(value = "查询用户信息", notes = "通过用户名、用户id查询用户的的个人信息")
    @GetMapping("/selectUser")
    @ExceptionHandler({Exception.class})
    public ResponseMap select(@ApiParam(name = "用户id", required = true)
                              @RequestParam(value = "userId", required = true) int userId) {
       log.error("开始查询");
        log.info("开始");
        User user = new User();
        user.setUserId(userId);
        return userService.select(user);
    }

    @ApiOperation(value = "用户登录", notes = "前端用户登录接口")
    @GetMapping("/login")
    public ResponseMap login(
            @ApiParam(name = "用户账户（用户名或用户email）", required = false)
            @RequestParam(value = "userName", required = false) String userName,
            @ApiParam(name = "用户email", required = false)
            @RequestParam(value = "email", required = false) String email,
            @ApiParam(name = "用户账户密码", required = true)
            @RequestParam(value = "password", required = true) String password) {
        User user = new User();
        user.setUserName(userName);
        user.setUserName(email);
        user.setPassword(password);
        return userService.login(user);
    }
}
