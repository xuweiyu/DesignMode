package com.xwy.designmode.mode.decorator;

/**
 * Created by xuweiyu on 2020-04-09.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    int cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + "价格：" + super.getPrice() + "," + drink.getDes();
    }
}
