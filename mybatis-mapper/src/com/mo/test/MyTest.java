package com.mo.test;

import com.mo.beans.User;
import com.mo.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 14:32
 * @Description :
 **/
public class MyTest {
    @Test
    public void test1() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(Resources.getResourceAsReader("SqlMapConfig.xml"));
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> list=userMapper.userQueryAll();
        for (Object obj:list){
            System.out.println(obj.toString());
        }
    }
}
