package com.yueguang.java.basic;

/**
 * @Description TODO
 * @Author yueguang
 * @Date 2020/12/15
 * @Version 1.0
 */
public class GlmapperGeneric<T> {
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
