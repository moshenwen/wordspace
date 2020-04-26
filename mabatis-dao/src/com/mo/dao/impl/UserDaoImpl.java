package com.mo.dao.impl;

import com.mo.beans.User;
import com.mo.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 12:59
 * @Description :
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public int userInsert(User user) {
        SqlSession sqlSession=getSqlSession();
        return sqlSession.insert("userInsert",user);

    }

    @Override
    public List<User> userQuery(User user) {
        SqlSession sqlSession=getSqlSession();

        return sqlSession.selectList("userQuery",user.getId());
    }
    public SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        try {
            SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(Resources.getResourceAsReader("SqlMapConfig.xml"));
            sqlSession=sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  sqlSession;
    }
}
