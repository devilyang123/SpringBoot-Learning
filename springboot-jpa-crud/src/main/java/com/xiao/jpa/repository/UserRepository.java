package com.xiao.jpa.repository;

import com.xiao.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description User Repository
 * @Auther: 笑笑是一个码农
 * @Date: 18:03 2019/12/15
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
