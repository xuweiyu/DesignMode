package com.xwy.designmode.mode.builder;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public abstract class House {
    abstract void buildBasic();
    abstract void buildWalls();
    abstract void buildRootfed();

    public void build(){
        buildBasic();
        buildWalls();
        buildRootfed();
    }
}
