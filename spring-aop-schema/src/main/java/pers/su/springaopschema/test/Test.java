package pers.su.springaopschema.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.su.simplebean.service.OrderService;
import pers.su.simplebean.service.entity.OrderDO;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        OrderService bean = context.getBean(OrderService.class);
        List<OrderDO> list = bean.list();
        System.out.println(list);

    }
}
