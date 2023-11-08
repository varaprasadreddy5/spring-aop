package com.varaprasadreddy5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.varaprasadreddy5")
@EnableAspectJAutoProxy

public class BeanConfig {
}
