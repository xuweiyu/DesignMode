package com.xwy.designmode.mode.builder.impove;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Client {
    public static void main(String[] args) {
        HeighHouseBuilder heighHouseBuilder = new HeighHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(heighHouseBuilder);
        houseDirector.directBuildHouse();
    }
}
