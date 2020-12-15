package com.yueguang.java.basic.proxy.jdk;

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
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
