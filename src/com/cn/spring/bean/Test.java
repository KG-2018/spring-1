package com.cn.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       /* HelloWorld helloWorld = new HelloWorld();

        helloWorld.setName("spring");*/

        ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");

        HelloWorld helloWorld = (HelloWorld) act.getBean("helloWorld");


        helloWorld.say();
    }
}
