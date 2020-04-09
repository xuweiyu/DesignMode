package com.xwy.designmode.mode.decorator;

/**
 * Created by xuweiyu on 2020-04-09.
 * email: xuweiyu@igengmei.com
 * 简介：巧克力调味品
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(4);
    }
}
