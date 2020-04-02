package com.xwy.designmode.mode.singleton;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：静态内部类
 */
public class StaticClassTest {
    public static void main(String[] args) {
        StaticClass instance1 = StaticClass.getInstance();
        StaticClass instance2 = StaticClass.getInstance();
        System.out.println(instance1.hashCode()==instance2.hashCode());
    }
}

class StaticClass{
    private StaticClass(){

    }

    private static class SingletonHolder{
        private static final StaticClass singleton = new StaticClass();
    }

    public static StaticClass getInstance(){
        return SingletonHolder.singleton;
    }
}
