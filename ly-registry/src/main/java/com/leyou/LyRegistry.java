package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author ssqswyf
 * @Date 2021/4/17
 */
@EnableEurekaServer
@SpringBootApplication
public class LyRegistry {


    public static void main(String[] args) {
        SpringApplication.run(LyRegistry.class);
    }
}
