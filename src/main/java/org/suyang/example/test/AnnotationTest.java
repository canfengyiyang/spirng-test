package org.suyang.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.suyang.example.controller.UserController;
import org.suyang.example.servcie.OrderService;
import org.suyang.example.servcie.UserService;

public class AnnotationTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation-context.xml");
        OrderService orderService = (OrderService) context.getBean("orderService");
        System.out.println(orderService);
        OrderService orderService1 = (OrderService) context.getBean("orderService");

        System.out.println(orderService1);

//        UserService userService = context.getBean(UserService.class);
//        System.out.println(userService);


//        UserController userController = context.getBean(UserController.class);
//        System.out.println(userController);
    }
}
