package com.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopPoing {

    @Pointcut("execution(public * com.po.*.*(..))")
    public void pc() {
    }
    @Around("pc()")
    public Object arount(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before around===============");
        Object proceed = point.proceed();
        System.out.println("after around===============");
        return proceed;
    }
}
