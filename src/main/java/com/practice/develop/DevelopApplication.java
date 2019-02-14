package com.practice.develop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DevelopApplication {
    private static Logger logger = Logger.getLogger(String.valueOf(DevelopApplication.class));

    public static void main(String[] args) {
        SpringApplication.run(DevelopApplication.class, args);
        logger.info("================开始启动===============");
        logger.info("================启动成功===============");
    }

}

