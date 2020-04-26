package com.mo.dao;

import com.mo.beans.User;

import java.util.List;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 14:12
 * @Description :
 **/
public interface UserMapper {
    public int  userInsert(User user);
    public int userUpdate(User user);
    public User userQueryById(User user);
    public List<User> userQueryAll();
    public int userDelete(User user);
}
