package com.shaw.demo.provider.service.impl;

import com.shaw.demo.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author xjd
 * @date 2023/4/24
 */
@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello!" + name;
    }

}
