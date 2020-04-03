package com.xwy.designmode.mode.factory;

import com.xwy.designmode.mode.factory.SimpleFactory.OrderPizza;
import com.xwy.designmode.mode.factory.SimpleFactory.SimpleFactory;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class PizzaTest {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.setFactory(new SimpleFactory());
    }
}
