package com.xwy.designmode.mode.builder.impove;


/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public abstract class Builder {
    private House house = new House();
    abstract void buildBasic();
    abstract void buildWalls();
    abstract void buildRootfed();

    public House buildHouse(){
        return house;
    }
}
