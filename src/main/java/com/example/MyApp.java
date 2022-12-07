package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        MessageService messageService = applicationContext.getBean("randomTextMessageService", MessageService.class);
        MessageService messageService1 = applicationContext.getBean("randomTextMessageService", MessageService.class);

        System.out.println(messageService.hashCode());
        System.out.println(messageService1.hashCode());

        System.out.println(messageService.getMessage());
    }
}
