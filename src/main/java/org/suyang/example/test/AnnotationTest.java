package org.suyang.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.suyang.example.servcie.Calculator;

public class AnnotationTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation-context.xml");
        Calculator bean = (Calculator) context.getBean("myCalculator");
        int i = 1;
        int j = 2;
        int add = bean.add(i, j);
        System.out.println(add);
    }
}
