package com.example.aop.aop.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* com.example.aop.aop.serviceimpl.*.*(..))")
    public void beforeOrderPackage(JoinPoint joinPoint)
    {
        log.info("Before Order Package...... ***this is logger Aspect kind{}",joinPoint.getKind());
        log.info("Before Order Package...... ***this is logger Aspect{} signature",joinPoint.getSignature());
    }
    @Before("within(com.example.aop.aop.serviceimpl.*)")
    public void beforeImpl(JoinPoint joinPoint)
    {
        log.info("this will be called within every service implementation");
    }

    @Before("@annotation(org.springframework.transaction.annotation.Transactional)")
    public void  beforeTransaction(JoinPoint joinPoint)
    {
        log.info("This wll run after every Transactional info");
    }

}
