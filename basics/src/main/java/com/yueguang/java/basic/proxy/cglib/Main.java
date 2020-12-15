package com.yueguang.java.basic.proxy.cglib;

import com.yueguang.java.basic.proxy.jdk.JdkProxyFactory;
import com.yueguang.java.basic.proxy.staticProxy.SmsService;
import com.yueguang.java.basic.proxy.staticProxy.SmsServiceImpl;

/**
 * @Description TODO
 * @Author yueguang
 * @Date 2020/12/15
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
    }
}
