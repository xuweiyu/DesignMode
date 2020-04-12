package com.xwy.designmode.mode.composite;

/**
 * Created by xuweiyu on 2020-04-10.
 * email: xuweiyu@igengmei.com
 * 简介：专业
 */
public class Department extends Organization{
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    void print() {
        System.out.println(this);
    }
}
