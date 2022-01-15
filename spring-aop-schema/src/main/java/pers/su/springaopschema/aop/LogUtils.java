package pers.su.springaopschema.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogUtils {

    public void before() {
        System.out.println("************前置通知************");
    }

    public void after() {
        System.out.println("*************后置通知***********");
    }

    public void afterReturning(Object retVal) {
        System.out.println("***********后置返回通知********** 返回内容：retVal :" + retVal.toString());
    }

    public void afterThrowing(Exception ex) {
        System.out.println("************后置异常通知********** 异常信息：" + ex.getMessage());
    }

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
