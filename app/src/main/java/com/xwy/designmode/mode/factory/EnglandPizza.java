package com.xwy.designmode.mode.factory;

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

    @Override
    public void cut() {
        System.out.println("切割英格兰披萨");
    }
}
