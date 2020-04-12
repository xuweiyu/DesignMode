package com.xwy.designmode.mode.flyweight;

/**
 * Created by xuweiyu on 2020-04-12.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class StringTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.info == b.info);

        String info = new String("info");
        System.out.println(a.info == info);
    }
}

class A {
    String info = "info";
}

class B {
    String info = "info";
}
