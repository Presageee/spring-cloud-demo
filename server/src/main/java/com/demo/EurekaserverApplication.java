package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by LJT on 17-4-26.
 * email: linjuntan@sensetime.com
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {
    public static void main(String[]args) {
        SpringApplication.run(EurekaserverApplication.class, args);
    }
}
