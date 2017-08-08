package com.iim;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xibin on 2017/8/8.
 */
@SpringBootApplication
@ComponentScan("com.iim")
@MapperScan(basePackages = "com.iim.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
