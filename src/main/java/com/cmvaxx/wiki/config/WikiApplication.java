package com.cmvaxx.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.cmvaxx.wiki.mapper")
@ComponentScan("com.cmvaxx")
@SpringBootApplication
public class WikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikiApplication.class, args);
    }

}
