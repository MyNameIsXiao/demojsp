package com.example.demojsp.entity;

public class User {
    //必须getset
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.print("姓名是：" + name);
    }
}
