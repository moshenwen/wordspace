package com.mo.beans;

import java.util.Date;

/**
 * @Author : MOSHEN
 * @Date :2020/4/25 14:11
 * @Description :
 **/
public class User {
    private int id;
    private String user;
    private String sex;
    private Date birthday;
    private int age;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int id, String user, String sex, Date birthday, int age) {
        this.id = id;
        this.user = user;
        this.sex = sex;
        this.birthday = birthday;
        this.age = age;
    }

    public User() {
    }
}
