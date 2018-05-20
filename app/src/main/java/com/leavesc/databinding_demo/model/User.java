package com.leavesc.databinding_demo.model;

/**
 * 作者：叶应是叶
 * 时间：2018/5/16 20:20
 * 描述：
 */
public class User {

    private String name;

    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
