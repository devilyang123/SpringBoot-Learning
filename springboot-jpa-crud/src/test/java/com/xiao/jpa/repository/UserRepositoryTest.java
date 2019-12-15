package com.xiao.jpa.repository;

import com.xiao.jpa.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {


    @Autowired
    private UserRepository  userRepository;

    @Test
    public void save(){
        //测试添加方法，因为ID我们是自增的，所以这里不用设置ID
        User user = new User();
        user.setAge(18);
        user.setUserName("笑笑是一个码农");
        user.setPassword("123456");
        userRepository.save(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(1); //这里需要设置ID，表示要修改对应的哪一条数据
        user.setAge(19);
        user.setUserName("笑笑是一个码农666");
        user.setPassword("123456");
        userRepository.save(user); //这里还是调用save方法
    }

    @Test
    public void findOne(){
        Optional<User> optional = userRepository.findById(1);//通过ID查询一条数据
        //Optional可以有效地防止空指针异常
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
    }

    @Test
    public void delete(){
        User user =  new User();
        user.setId(1);
        userRepository.delete(user);
    }

}