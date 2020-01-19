package com.xiao.mapper;

import com.xiao.entity.User;

/**
 * @Description
 * @Auther: 笑笑是一个码农
 * @Date: 22:08 2020/1/6
 */
public interface UserMapper {

    /**
     * 通过用户ID获取用户信息
     * @param id
     * @return
     */
    User getUserById(long id);
}
