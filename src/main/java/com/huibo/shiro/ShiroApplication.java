package com.huibo.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @ComponentScan 扫描路径
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.huibo.*"})
@MapperScan("com.huibo.dao")
public class ShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class, args);
    }

}
