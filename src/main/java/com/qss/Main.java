package com.qss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(Main.class, args);
        System.out.println("master commit");
        System.out.println("dev init");
        System.out.println("dev 1");
        System.out.println("dev 修复404");
        System.out.println("dev 修复405");
        System.out.println("dev 待提交内容");
    }
}