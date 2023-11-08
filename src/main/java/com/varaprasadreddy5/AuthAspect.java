package com.varaprasadreddy5;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {
    @Pointcut("within(com.varaprasadreddy5..*)")
    public void authPointCut(){

    }
    @Pointcut("within(com.varaprasadreddy5..*)")
    public void authoPointCut(){

    }
    @Before("authPointCut()")
    public void authenticate(){
        System.out.println("authenticating request");
    }
}
