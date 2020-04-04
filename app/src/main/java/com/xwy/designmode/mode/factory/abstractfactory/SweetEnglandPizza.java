package com.xwy.designmode.mode.factory.abstractfactory;

import com.xwy.designmode.mode.factory.Pizza;

/**
 * Created by xuweiyu on 2020-04-03.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SweetEnglandPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备制作甜味英格兰披萨");
    }
}
