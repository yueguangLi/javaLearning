package com.yueguang.java.basic;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author yueguang
 * @Date 2020/12/15
 * @Version 1.0
 */
@Slf4j
public class Basic1 {

    @Test
    public void test01(){
        log.info("字符串长度：{}", "李跃光".length());
    }

    @Test
    public void generics(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abc");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(123);

        System.out.println(list1.getClass() == list2.getClass());
    }

    @Test
    public void generics2() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);  //这样调用 add 方法只能存储整形，因为泛型类型的实例为 Integer

        list.getClass().getMethod("add", Object.class).invoke(list, "asd");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void generics3(){
        /**不指定泛型的时候*/
        int i = Basic1.add(1, 2); //这两个参数都是Integer，所以T为Integer类型
        Number f = Basic1.add(1, 1.2); //这两个参数一个是Integer，以风格是Float，所以取同一父类的最小级，为Number
        Object o = Basic1.add(1, "asd"); //这两个参数一个是Integer，以风格是Float，所以取同一父类的最小级，为Object

        /**指定泛型的时候*/
        int a = Basic1.<Integer>add(1, 2); //指定了Integer，所以只能为Integer类型或者其子类
        //int b = Basic1.<Integer>add(1, 2.2); //编译错误，指定了Integer，不能为Float
        Number c = Basic1.<Number>add(1, 2.2); //指定为Number，所以可以为Integer和Float
    }

    //这是一个简单的泛型方法
    public static <T> T add(T x,T y){
        return y;
    }

    public static <E> void printArray( E[] inputArray )
    {
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    @Test
    public void generics4(){
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        printArray( intArray  );
        printArray( stringArray  );
    }
}
