package com.xwy.designmode.mode.factory.abstractfactory;

import com.xwy.designmode.mode.factory.Pizza;

/**
 * Created by xuweiyu on 2020-04-04.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SaltyFactory extends AbstractFactory {
    @Override
    Pizza createPizza() {
        if ("Greek".equals(getType())){
            return new SaltyGreekPizza();
        }else if ("England".equals(getType())){
            return new SaltyEnglandPizza();
        }
        return null;
    }
}
