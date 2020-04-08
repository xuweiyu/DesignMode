package com.xwy.designmode.mode.bridgemode;

/**
 * Created by xuweiyu on 2020-04-08.
 * email: xuweiyu@igengmei.com
 * 简介：手机
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call() {
        brand.call();
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }
}
