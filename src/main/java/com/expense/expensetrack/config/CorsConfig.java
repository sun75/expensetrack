package com.expense.expensetrack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * @author: shh
 * @createTime: 2025/1/2320:36
 */

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
//                        .allowedOrigins("http://localhost:3000") // 允许前端的地址
//                        .allowedOrigins("https://myexpensefrontend-14r8cpmzv-huihuis-projects-0db6645c.vercel.app/") // 允许前端的地址
                        .allowedOrigins("https://myexpensefrontend.vercel.app/") // 允许前端的地址
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}

