package com.vk;

import com.vk.rest.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan()
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
