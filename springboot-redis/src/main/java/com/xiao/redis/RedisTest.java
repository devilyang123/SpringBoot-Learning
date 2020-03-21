package com.xiao.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description redis
 * @Auther: 笑笑是一个码农
 * @Date: 16:24 2020/3/21
 */
@Component
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 设置指定key对应的String类型的值
     * @param k
     * @param v
     */
    public void setString(String k, String v){
        stringRedisTemplate.opsForValue().set(k, v);
    }

    /**
     * 通过key获取指定的String类型的值
     * @param k
     * @return
     */
    public String getString(String k){
        return stringRedisTemplate.opsForValue().get(k);
    }
}
