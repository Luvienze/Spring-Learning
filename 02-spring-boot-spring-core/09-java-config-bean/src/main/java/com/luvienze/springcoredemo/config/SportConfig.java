package com.luvienze.springcoredemo.config;

import com.luvienze.springcoredemo.common.Coach;
import com.luvienze.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
