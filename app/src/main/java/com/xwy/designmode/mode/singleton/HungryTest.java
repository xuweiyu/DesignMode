package com.xwy.designmode.mode.singleton;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：饿汉式
 */
public class HungryTest {
    public static void main(String[] args) {
        Hungry hungry1 = Hungry.getInstance();
        Hungry hungry2 = Hungry.getInstance();
        System.out.println(hungry1.hashCode());
        System.out.println(hungry2.hashCode());
    }
}

class Hungry{
    private static Hungry instance= new Hungry();
    private Hungry(){

    }

    public static Hungry getInstance(){
        return instance;
    }
}
