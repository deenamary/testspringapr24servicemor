package com.example.testapr24servicemor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class AppConfig {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${admin.username}")
    private String adminUserName;

    @Bean
    public String appName() {
        return appName;
    }

    @Bean("admin_username")
    public String getAdminUserName() {
        return adminUserName;
    }
}
