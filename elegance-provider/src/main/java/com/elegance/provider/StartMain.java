package com.elegance.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2018/4/25 0025.
 */
public class StartMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring.xml,classpath*:spring-dubbo.xml");
        context.start();
        try {
            System.in.read();
        }catch (IOException e){

        }
    }

}
