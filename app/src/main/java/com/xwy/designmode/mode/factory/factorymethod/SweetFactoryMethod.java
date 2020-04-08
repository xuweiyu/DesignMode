package com.xwy.designmode.mode.factory.factorymethod;

import com.xwy.designmode.mode.factory.Pizza;

/**
 * Created by xuweiyu on 2020-04-03.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SweetFactoryMethod extends FactoryMethod {
    @Override
    Pizza createPizza() {
        Pizza pizza = null;
        String type = getType();
        if ("England".equals(type)) {
            pizza = new SweetEnglandPizza();
        } else if ("Greek".equals(type)) {
            pizza = new SweetGreekPizza();
        }
        return pizza;
    }
}
