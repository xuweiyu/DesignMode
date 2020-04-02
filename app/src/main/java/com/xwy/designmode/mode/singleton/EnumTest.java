package com.xwy.designmode.mode.singleton;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class EnumTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.SINSTANCE;
        Singleton singleton2 = Singleton.SINSTANCE;
        Singleton singleton3 = Singleton.AAA;
        Singleton singleton4 = Singleton.AAA;
        System.out.println(singleton1.hashCode()==singleton2.hashCode());
        System.out.println(singleton1.hashCode()==singleton3.hashCode());
        System.out.println(singleton3.hashCode()==singleton4.hashCode());
    }
}

enum Singleton {
    SINSTANCE,AAA;

    public void sayOK() {
        System.out.println("say ok");
    }
}
