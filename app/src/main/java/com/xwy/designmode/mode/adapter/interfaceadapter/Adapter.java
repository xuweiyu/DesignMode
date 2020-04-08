package com.xwy.designmode.mode.adapter.interfaceadapter;

/**
 * Created by xuweiyu on 2020-04-08.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Adapter extends AbsAdapter {
    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {//只需要实现我们感兴趣的方法
        System.out.println("执行方法1");
        int sourceData = source.getSource();
        doSomething(sourceData);
    }

    public void doSomething(int sourceData){
        System.out.println("做转换");
    }
}
