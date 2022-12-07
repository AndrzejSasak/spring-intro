package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean("randomTextMessageService")
    @Scope("prototype")
    public MessageService randomTextMessageService() {
        return new RandomTextMessageService();
    }

    @Bean("messageService")
    @Scope("prototype")
    public MessageService myNameMessageService() {
        return new MyNameMessageService();
    }

}
