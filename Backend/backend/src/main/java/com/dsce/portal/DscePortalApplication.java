package com.dsce.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DscePortalApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DscePortalApplication.class, args);
    }
}