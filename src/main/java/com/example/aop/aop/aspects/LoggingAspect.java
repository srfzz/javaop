package com.example.aop.aop.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* orderPackage(..))")
    public void beforeOrderPackage()
    {log.info("Before Order Package");}
}
