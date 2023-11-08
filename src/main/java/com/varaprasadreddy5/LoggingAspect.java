package com.varaprasadreddy5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.varaprasadreddy5.Billing.billingit(..))")
    public void beforeLogger(){
         System.out.println("logging");
    }

    @After("execution(* *.*.*.billingit(..))")
    public void afterLogger(){
        System.out.println("logout");
    }
}
