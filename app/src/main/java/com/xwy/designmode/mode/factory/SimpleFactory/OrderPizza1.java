package com.xwy.designmode.mode.factory.SimpleFactory;

import com.xwy.designmode.mode.factory.Pizza;

import java.util.Scanner;

/**
 * Created by xuweiyu on 2020-04-03.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class OrderPizza1 {
    public void setFactory() {
        String type ;
        do {
            type = getType();
            Pizza pizza = SimpleFactory1.createPizza(type);
            if (pizza !=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    private String getType() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
