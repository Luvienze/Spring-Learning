package com.luvienze.springcoredemo.config;

import com.luvienze.springcoredemo.common.Coach;
import com.luvienze.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //by default the bean id is swimCoach
    //when use brackets, we create custom beanid
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
