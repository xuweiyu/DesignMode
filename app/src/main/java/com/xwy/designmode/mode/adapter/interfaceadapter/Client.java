package com.xwy.designmode.mode.adapter.interfaceadapter;

/**
 * Created by xuweiyu on 2020-04-08.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method1();
        //匿名内部类的方式调用
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void method1() {
                super.method1();
            }

            @Override
            public void method2() {
                super.method2();
            }

            @Override
            public void method3() {
                System.out.println("执行方法3");
            }
        };
        absAdapter.method3();
    }
}
