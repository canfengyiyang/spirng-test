package org.suyang.example.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.suyang.example.servcie.OrderService;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
//        System.out.println(context.getBean("orderService"));
//        System.out.println(context.getBean("orderService2"));
//        System.out.println(context.getBean("order3"));
//        System.out.println(context.getBean("order4"));

//        Object user = context.getBean("user2");
//        System.out.println(user);

        OrderService bean = context.getBean(OrderService.class);
        context.registerShutdownHook();
//        bean.test();
    }
}
