package com.mo.test;

import com.mo.dao.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 12:27
 * @Description :
 **/
public class MyTest {
    @Test
    public void test1() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        InputStream inputStream=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> list =sqlSession.selectList("queryUserById",1);
        for (User user:list){
            System.out.println(user.toString());
        }
        sqlSession.close();


    }
    @Test
    public void test2() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(Resources.getResourceAsReader("SqlMapConfig.xml"));
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user= new User(1,"张菲菲","12",new Date(),11);
        System.out.println(sqlSession.insert("insertUser",user));
        sqlSession.close();
    }
}
