package com.mo.test;

import com.mo.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 17:38
 * @Description :
 **/
public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");

        UserDao userDao= (UserDao) applicationContext.getBean("UserDao");
        userDao.save();
        applicationContext.close();
    }
}
