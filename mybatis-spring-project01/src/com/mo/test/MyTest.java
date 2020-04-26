package com.mo.test;

import com.mo.dao.UserMapper;
import com.mo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author : MOSHEN
 * @Date :2020/4/26 13:18
 * @Description :
 **/
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper= (UserMapper) applicationContext.getBean(UserMapper.class);
        List<User> list= userMapper.userInsertAll();
        for (User user:list){
            System.out.println(user.toString());
        }

    }
}
