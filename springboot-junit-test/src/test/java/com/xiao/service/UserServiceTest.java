package com.xiao.service;

import com.xiao.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;  //注入我们要测试的类

    @Test
    public void getUser() {
        //调用要测试的方法
        User user = userService.getUser("笑笑是一个码农");
        //由于我们非常确定不存在“aaa的用户,所以getUser的返回值一定为null”
        //Assert为junit提供用于测试的类（断言），其里面有很多方法来判断被测方法实际的返回结果和预期的返回结果（正确的结果）是否一致
        //预期返回值user一定不null
        Assert.assertNotNull(user);
    }
}