package com.dashan.news.service.impl;

import com.dashan.news.common.ResponseMap;
import com.dashan.news.mapper.UserMapper;
import com.dashan.news.pojo.User;
import com.dashan.news.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public ResponseMap insert(User user) {

        return null;
    }

    @Override
    public ResponseMap update(User user) {
        return null;
    }

    @Override
    public ResponseMap delecte(User user) {
        return null;
    }

    @Override
    public ResponseMap select(User user) {
        User user1 = userMapper.select(user);
        if (user1.getUserId() != 0){
            return ResponseMap.success("OK",user1);
        }else{
            return ResponseMap.fail("用户不存在！");
        }
    }

    @Override
    public ResponseMap login() {
        return null;
    }
}
