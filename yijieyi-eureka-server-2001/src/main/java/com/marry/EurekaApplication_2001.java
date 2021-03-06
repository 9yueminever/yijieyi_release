package com.marry;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication_2001 {
 
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_2001.class, args);
    }
}