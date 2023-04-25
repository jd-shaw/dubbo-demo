package com.shaw.demo.consumer.task;

import com.shaw.demo.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author xjd
 * @date 2023/4/24
 */
@Component
public class Task implements CommandLineRunner {
    @DubboReference
    private HelloService helloService;

    @Override
    public void run(String... args) throws Exception {
        String result = helloService.sayHello("world");
        System.out.println("Receive result ======> " + result);

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println(new Date() + " Receive result ======> " + helloService.sayHello("world"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}
