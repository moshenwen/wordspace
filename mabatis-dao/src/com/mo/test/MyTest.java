package com.mo.test;

import com.mo.beans.User;
import com.mo.dao.UserDao;
import com.mo.dao.impl.UserDaoImpl;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 12:59
 * @Description :
 **/
public class MyTest {
    @Test
    public void test1(){
        UserDao userDao =new UserDaoImpl();
        User user=new User(1,"李梅梅","女",new Date(),12);
        System.out.println(userDao.userInsert(user));
        List<User> list=userDao.userQuery(user);
        for (User user1:list){
            System.out.println(user1.toString());
        }


    }
}
