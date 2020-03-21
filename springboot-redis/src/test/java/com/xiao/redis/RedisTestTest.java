package com.xiao.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootApplication
public class RedisTestTest {

    @Autowired
    private RedisTest redisTest;


    @Test
    public void setString() {
        redisTest.setString("mykey", "笑笑");
    }

    @Test
    public void getString() {
        String mykey = redisTest.getString("mykey");
        Assert.assertNotNull(mykey);
        System.out.println(mykey);
    }
}