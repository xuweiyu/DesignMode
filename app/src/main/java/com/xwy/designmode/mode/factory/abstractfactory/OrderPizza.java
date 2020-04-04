package com.xwy.designmode.mode.factory.abstractfactory;

import com.xwy.designmode.mode.factory.Pizza;

import java.util.Scanner;

/**
 * Created by xuweiyu on 2020-04-04.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class OrderPizza {
    private AbstractFactory factory;
    public void orderPizza(){
        Pizza pizza;
        do {
            factory = new SweetFactory();
            pizza = factory.createPizza();
            if (!exe(pizza)){
              break;
            }
            factory = new SaltyFactory();
            pizza = factory.createPizza();
            if (!exe(pizza)){
                break;
            }
        }while (true);
    }

    private boolean exe(Pizza pizza) {
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return true;
        }
        return false;
    }

}
