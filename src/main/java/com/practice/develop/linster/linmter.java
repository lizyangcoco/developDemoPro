package com.practice.develop.linster;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by 李泽阳 on 2019/8/7
 */
@Component
public class linmter implements ApplicationListener<ContextRefreshedEvent>, ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.print("ssss");
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.print("ssss");
    }
}
