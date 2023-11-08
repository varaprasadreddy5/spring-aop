package com.varaprasadreddy5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)  {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Billing bill = applicationContext.getBean(Billing.class);
        bill.billingit("800");
    }
}