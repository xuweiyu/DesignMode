package com.xwy.designmode.mode.decorator;

/**
 * Created by xuweiyu on 2020-04-09.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Soy extends Decorator{
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(3);
    }
}
