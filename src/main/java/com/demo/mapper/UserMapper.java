package com.demo.mapper;

import com.demo.entity.User;

public interface UserMapper {

    User selectById(Integer userId);
}
