package com.dashan.news.pojo;

import lombok.Data;

@Data
public class User extends com.dashan.news.po.user.User {
    private Integer userId;
    private String userName;
    private String email;
    private String password;
}
