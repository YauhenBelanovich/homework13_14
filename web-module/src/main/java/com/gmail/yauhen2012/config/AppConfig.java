package com.gmail.yauhen2012.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:config.properties"})
@ComponentScan(basePackages = {"com.gmail.yauhen2012"})
public class AppConfig {

}
