package com.xiao.mapper;

import com.xiao.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Description
 * @Auther: 笑笑是一个码农
 * @Date: 22:08 2020/1/6
 */
public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    public User getUserById(long id);
}
