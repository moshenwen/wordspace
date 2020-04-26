package com.mo.dao;

import sun.font.FontRunIterator;

import java.util.Date;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 12:08
 * @Description :
 **/
public class User {
    private int id;
    private String user;
    private String sex;
    private Date birthday;
    private int age;

    public User(int id, String user, String sex, Date birthday, int age) {
        this.id = id;
        this.user = user;
        this.sex = sex;
        this.birthday = birthday;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }

}
