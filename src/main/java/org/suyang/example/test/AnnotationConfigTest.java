package org.suyang.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.suyang.example.AppConfig;
import org.suyang.example.WorkService;
import org.suyang.example.dao.UserDao;
import org.suyang.example.servcie.OrderService;

public class AnnotationConfigTest {

    public static void main(String[] args) {

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OrderService.class, UserDao.class);
//        OrderService orderService = context.getBean(OrderService.class);
//        System.out.println(orderService);


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        System.out.println(orderService);

        WorkService workService = context.getBean(WorkService.class);
        System.out.println(workService);
        WorkService workService1 = context.getBean(WorkService.class);
        System.out.println(workService1);
    }
}
