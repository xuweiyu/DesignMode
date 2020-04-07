package com.xwy.designmode.mode.builder;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class HeighHouse extends House{
    @Override
    void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    void buildRootfed() {
        System.out.println("高楼封顶");
    }
}
