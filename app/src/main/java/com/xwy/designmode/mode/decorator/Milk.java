package com.xwy.designmode.mode.decorator;

/**
 * Created by xuweiyu on 2020-04-09.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2);
    }
}
