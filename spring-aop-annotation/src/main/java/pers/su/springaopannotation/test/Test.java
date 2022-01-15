package pers.su.springaopannotation.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.su.simplebean.service.OrderService;
import pers.su.simplebean.entity.OrderDO;
import pers.su.springaopannotation.AppConfig;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService bean = context.getBean(OrderService.class);
        List<OrderDO> list = bean.list();
        System.out.println(list);

    }
}
