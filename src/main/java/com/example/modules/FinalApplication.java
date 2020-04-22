package com.example.modules;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.modules.activity.mapper")
@SpringBootApplication
public class FinalApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinalApplication.class, args);
        System.out.println("the Main Url:");
    }

}
