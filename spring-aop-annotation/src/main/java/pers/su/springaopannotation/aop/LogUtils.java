package pers.su.springaopannotation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogUtils {

    /**
     * 第一个 * 表示匹配所有类型的方法返回值
     * pers.su.springaopannotation.service..* 表示匹配pers.su.springaopannotation.service所以包下的类，包括子类
     * *(..) *表示匹配类下的所有方法，（..）表示匹配任意入参
     */
    @Pointcut("execution(* pers.su.simplebean.service..*.*(..))")
    public void myPoint() {
    }

    @Before("myPoint()")
    public void before() {
        System.out.println("************前置通知************");
    }

    @After("myPoint()")
    public void after() {
        System.out.println("*************后置通知***********");
    }

    @AfterReturning(value = "myPoint()", returning = "retVal")
    public void afterReturning(Object retVal) {
        System.out.println("***********后置返回通知********** 返回内容：retVal :" + retVal.toString());
    }

    @AfterThrowing(value = "myPoint()", throwing = "ex")
    public void afterThrowing(Exception ex) {
        System.out.println("************后置异常通知********** 异常信息：" + ex.getMessage());
    }

    @Around("myPoint()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        try {
            System.out.println("*********环绕通知开始**********");
            Object result = pjp.proceed();
            System.out.println("*********环绕通知结束**********");
            return result;
        } catch (Exception ex) {
            System.out.println("*********环绕通知异常********** 异常信息；" + ex.getMessage());
        }
        return null;
    }
}
