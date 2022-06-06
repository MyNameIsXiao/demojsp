package com.example.demojsp.config;

import com.example.demojsp.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

     //大声道

    @Bean
    public User init() {
        User user = new User();
        user.setName("张三");
        return user;
    }

}
