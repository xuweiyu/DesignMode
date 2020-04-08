package com.xwy.designmode.mode.bridgemode;

/**
 * Created by xuweiyu on 2020-04-08.
 * email: xuweiyu@igengmei.com
 * 简介：折叠手机
 */
public class FoldPhone extends Phone {
    public FoldPhone(Brand brand) {
        super(brand);
    }

    protected void call() {
        super.call();
        System.out.println("折叠手机");
    }

    protected void open() {
        super.open();
        System.out.println("折叠手机");
    }

    protected void close() {
        super.close();
        System.out.println("折叠手机");
    }
}
