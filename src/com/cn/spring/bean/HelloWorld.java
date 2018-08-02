package com.cn.spring.bean;

public class HelloWorld {
    private String name;

    public HelloWorld() {
        System.out.println("this is spring constructor");
    }

    public void setName(String name) {
        System.out.println("this is spring setName");
        this.name = name;
    }

    public void say(){
        System.out.println("Hello," + name);
    }
}
