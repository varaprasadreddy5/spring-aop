package com.varaprasadreddy5;

import org.springframework.stereotype.Component;

@Component
public class Billing {
    public void billingit(String amount){
        System.out.println("billing done");
    }
}
