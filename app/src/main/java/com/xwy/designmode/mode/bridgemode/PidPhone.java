package com.xwy.designmode.mode.bridgemode;

/**
 * Created by xuweiyu on 2020-04-08.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class PidPhone extends Phone{
    public PidPhone(Brand brand) {
        super(brand);
    }

    protected void call() {
        super.call();
        System.out.println("平板手机");
    }

    protected void open() {
        super.open();
        System.out.println("平板手机");
    }

    protected void close() {
        super.close();
        System.out.println("平板手机");
    }
}
