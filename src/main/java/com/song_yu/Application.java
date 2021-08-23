package com.song_yu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *spring-boot 工程都有一个启动引导类，这是工程的入口类
 * 在启动引导类中 添加SpringBootApplication 注解
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
