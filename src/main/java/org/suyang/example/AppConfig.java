package org.suyang.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@ComponentScan("org.suyang.example")
//@Configuration
//@Import(OrderService.class)
public class AppConfig {


    @Bean
    public WorkService workService() {

        System.out.println("创建WorkService");
        return new WorkService();
    }
}
