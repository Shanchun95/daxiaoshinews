package com.dashan.news.service;

import com.dashan.news.common.ResponseMap;
import com.dashan.news.po.user.User;


public interface UserService {

    ResponseMap insert(User user);

    ResponseMap update(User user);

    ResponseMap delecte(User user);

    ResponseMap select(User user);

    ResponseMap login(User user);
}
