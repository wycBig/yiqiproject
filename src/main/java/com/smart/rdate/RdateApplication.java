package com.smart.rdate;

import com.smart.rdate.service.LocTraceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class RdateApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(RdateApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //这里的HelloApplication是SpringBoot的启动类
        return builder.sources(RdateApplication.class);
    }
}
