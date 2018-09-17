package com.vz.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 16:41:39
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAuthApplication.class, args);
    }
}
