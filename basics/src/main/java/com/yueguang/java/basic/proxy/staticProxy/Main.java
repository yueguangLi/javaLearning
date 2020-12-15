package com.yueguang.java.basic.proxy.staticProxy;

/**
 * @Description TODO
 * @Author yueguang
 * @Date 2020/12/15
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java");
    }
}
