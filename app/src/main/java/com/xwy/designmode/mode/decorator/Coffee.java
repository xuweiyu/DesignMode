package com.xwy.designmode.mode.decorator;

/**
 * Created by xuweiyu on 2020-04-09.
 * email: xuweiyu@igengmei.com
 * 简介：将咖啡的共同特点
 */
public abstract class Coffee extends Drink {
    @Override
    int cost() {
        return super.getPrice();
    }
}
