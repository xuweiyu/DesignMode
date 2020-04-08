package com.xwy.designmode.mode.factory.factorymethod;

import com.xwy.designmode.mode.factory.Pizza;

import java.util.Scanner;

/**
 * Created by xuweiyu on 2020-04-03.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public abstract class FactoryMethod {
    abstract Pizza createPizza();

    protected String getType() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void orderPizza() {
        do {
            Pizza pizza = createPizza();
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                return;
            }
        }while (true);

    }
}
