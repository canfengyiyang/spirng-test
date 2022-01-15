package org.suyang.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogUtils {


    @Before("execution(* org.suyang.example.servcie..*.*(..))")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();

        System.out.println("toString:::" + signature.toString());

        System.out.println("toShortString:::" + signature.toShortString());

        System.out.println("toLongString:::" + signature.toLongString());

        System.out.println("getName:::" + signature.getName());

        System.out.println("getModifiers:::" + signature.getModifiers());

        System.out.println("getDeclaringType:::" + signature.getDeclaringType());

        System.out.println("getDeclaringTypeName:::" + signature.getDeclaringTypeName());

        String methodName = joinPoint.getSignature().getName();
        System.out.println("方法执行前 方法名称：" + methodName + " ,方法参数：" + Arrays.asList(args).toString());
    }
}
