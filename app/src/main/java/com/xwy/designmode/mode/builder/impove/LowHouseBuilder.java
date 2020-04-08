package com.xwy.designmode.mode.builder.impove;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class LowHouseBuilder extends Builder {
    @Override
    void buildBasic() {
        System.out.println("矮楼打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("矮楼砌墙");
    }

    @Override
    void buildRootfed() {
        System.out.println("矮楼封顶");
    }
}
