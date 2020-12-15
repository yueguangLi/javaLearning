package com.yueguang.java.basic.proxy.jdk;

/**
 * @Description TODO
 * @Author yueguang
 * @Date 2020/12/15
 * @Version 1.0
 */
public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}

