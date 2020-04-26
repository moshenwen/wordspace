package com.mo.dao;

import com.mo.beans.User;

import java.util.List;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 12:58
 * @Description :
 **/
public interface UserDao {
    public int userInsert(User user);
    public List<User> userQuery(User user);
}
