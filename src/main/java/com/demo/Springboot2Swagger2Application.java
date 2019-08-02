package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.demo.mapper")
public class Springboot2Swagger2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2Swagger2Application.class, args);
    }

}
