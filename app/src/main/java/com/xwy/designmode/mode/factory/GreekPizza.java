package com.xwy.designmode.mode.factory;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：希腊披萨
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备制作希腊披萨");
    }

    @Override
    public void cut() {
        System.out.println("切割希腊披萨");
    }

}
