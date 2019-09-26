package com.dashan.news.mapper;

import com.dashan.news.common.ResponseMap;
import com.dashan.news.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    ResponseMap insert(User user);

    User select(User user);

}
