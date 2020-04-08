package com.xwy.designmode.mode.bridgemode;

/**
 * Created by xuweiyu on 2020-04-08.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldPhone(new Xiaomi());
        phone1.open();
        Phone phone2 = new FoldPhone(new Huawei());
        phone2.open();

        Phone phone3 = new SlideCoverPhone(new Xiaomi());
        phone3.open();
        Phone phone4 = new SlideCoverPhone(new Huawei());
        phone4.open();
    }
}
