package com.xwy.designmode.mode.bridgemode;

/**
 * Created by xuweiyu on 2020-04-08.
 * email: xuweiyu@igengmei.com
 * 简介：滑盖手机
 */
public class SlideCoverPhone extends Phone{
    public SlideCoverPhone(Brand brand) {
        super(brand);
    }

    protected void call() {
        super.call();
        System.out.println("滑盖手机");
    }

    protected void open() {
        super.open();
        System.out.println("滑盖手机");
    }

    protected void close() {
        super.close();
        System.out.println("滑盖手机");
    }
}
