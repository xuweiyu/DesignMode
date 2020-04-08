package com.xwy.designmode.mode.builder.impove;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class HouseDirector {
    Builder builder;

    public HouseDirector(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public House directBuildHouse(){
        builder.buildBasic();
        builder.buildWalls();
        builder.buildRootfed();
        return builder.buildHouse();
    }
}
