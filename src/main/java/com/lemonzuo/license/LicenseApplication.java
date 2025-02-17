package com.lemonzuo.license;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author LemonZuo
 * @create 2024-02-22 8:57
 */
@EnableScheduling
@SpringBootApplication
@MapperScan("com.lemonzuo.license.jetbrains.mapper")
public class LicenseApplication {
    public static void main(String[] args) {
        SpringApplication.run(LicenseApplication.class, args);
    }
}
