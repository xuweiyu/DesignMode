package com.xwy.designmode.mode.factory.SimpleFactory;

import com.xwy.designmode.mode.factory.Pizza;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class EnglandPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备制作英格兰披萨");
    }
}
