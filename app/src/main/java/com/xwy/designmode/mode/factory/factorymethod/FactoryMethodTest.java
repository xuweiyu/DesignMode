package com.xwy.designmode.mode.factory.factorymethod;

/**
 * Created by xuweiyu on 2020-04-03.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new SweetFactoryMethod();
        factoryMethod.orderPizza();
        FactoryMethod factoryMethod2 = new SaltyFactoryMethod();
        factoryMethod2.orderPizza();
    }
}
