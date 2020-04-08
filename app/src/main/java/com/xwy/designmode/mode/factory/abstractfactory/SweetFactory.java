package com.xwy.designmode.mode.factory.abstractfactory;

import com.xwy.designmode.mode.factory.Pizza;

/**
 * Created by xuweiyu on 2020-04-04.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SweetFactory extends AbstractFactory {
    @Override
    Pizza createPizza() {
        if ("Greek".equals(getType())){
            return new SweetGreekPizza();
        }else if ("England".equals(getType())){
            return new SweetEnglandPizza();
        }
        return null;
    }
}
