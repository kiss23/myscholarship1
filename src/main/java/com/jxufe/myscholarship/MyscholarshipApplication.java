package com.jxufe.myscholarship;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;
@MapperScan("com.jxufe.myscholarship.service")
@EnableScheduling
@SpringBootApplication
public class MyscholarshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyscholarshipApplication.class, args);
    }

}
