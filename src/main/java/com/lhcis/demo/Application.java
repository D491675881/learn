package com.lhcis.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
        log.info("PortalApplication is success!");
        System.err.println("sample started. http://localhost:8080/user/test");
//        SpringApplication.run(Application.class, args);
    }
}

