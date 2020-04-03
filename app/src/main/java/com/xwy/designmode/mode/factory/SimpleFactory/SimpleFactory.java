package com.xwy.designmode.mode.factory.SimpleFactory;

import com.xwy.designmode.mode.factory.EnglandPizza;
import com.xwy.designmode.mode.factory.GreekPizza;
import com.xwy.designmode.mode.factory.Pizza;

/**
 * Created by xuweiyu on 2020-04-03.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SimpleFactory {
   //根据类型创建不同的pizza
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if ("England".equals(type)){
            pizza = new EnglandPizza();
        }else if ("Greek".equals(type)){
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
