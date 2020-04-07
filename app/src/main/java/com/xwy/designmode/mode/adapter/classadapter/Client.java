package com.xwy.designmode.mode.adapter.classadapter;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
