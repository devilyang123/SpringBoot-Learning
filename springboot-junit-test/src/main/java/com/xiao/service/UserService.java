package com.xiao.service;

import com.xiao.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Description 模拟业务测试
 * @Auther: 笑笑是一个码农
 * @Date: 17:00 2019/11/17
 */
@Service
public class UserService {


    /**
     * 模拟根据用户名获取User对象
     * @param userName
     * @return
     */
    public User getUser(String userName){
        if(userName != null && !userName.equals("")){
            if("笑笑是一个码农".equals(userName)){
                User user = new User();
                user.setUserName("笑笑是一个码农");
                user.setAge(18);
                return user;
            }else {
                return null;
            }
        }
        return null;
    }
}
