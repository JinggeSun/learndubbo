package com.sun.dubba;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zcm
 */
@SpringBootApplication
@EnableDubbo
public class ProduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduceApplication.class,args);
    }
}
