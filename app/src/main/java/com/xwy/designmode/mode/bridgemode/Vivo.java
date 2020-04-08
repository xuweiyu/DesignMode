package com.xwy.designmode.mode.bridgemode;

/**
 * Created by xuweiyu on 2020-04-08.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Vivo implements Brand {
    @Override
    public void call() {
        System.out.println("VIVO手机打电话");
    }

    @Override
    public void open() {
        System.out.println("VIVO手机关机");
    }

    @Override
    public void close() {
        System.out.println("VIVO手机开机");
    }
}
