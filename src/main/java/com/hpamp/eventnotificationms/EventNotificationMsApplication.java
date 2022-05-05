package com.hpamp.eventnotificationms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventNotificationMsApplication /*implements ApplicationContextInitializer<GenericApplicationContext>*/ {

    public static void main(String[] args) {
        SpringApplication.run(EventNotificationMsApplication.class, args);
    }

    /*@Override
    public void initialize(GenericApplicationContext context) {
context.registerBean("function", FunctionRe);
    }*/
}
