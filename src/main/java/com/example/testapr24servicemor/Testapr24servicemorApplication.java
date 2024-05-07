package com.example.testapr24servicemor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Testapr24servicemorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Testapr24servicemorApplication.class, args);
    }

}
