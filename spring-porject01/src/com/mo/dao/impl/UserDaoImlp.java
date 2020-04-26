package com.mo.dao.impl;

import com.mo.dao.UserDao;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 17:34
 * @Description :
 **/
public class UserDaoImlp implements UserDao {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("save....."+name);
    }
    @Override
    public void init(){
        System.out.println("init"+name);
    }
    @Override
    public void destroy(){
        System.out.println("deestroy....."+name);
    }
}
