package org.suyang.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.suyang.example.servcie.OrderService;

@ComponentScan("org.suyang.example")
@Configuration
public class AppConfig {


    @Bean
    public WorkService getW() {

        System.out.println("创建WorkService");
        return new WorkService();
    }
}
