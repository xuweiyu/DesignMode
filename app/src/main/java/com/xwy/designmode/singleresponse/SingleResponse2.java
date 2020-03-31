package com.xwy.designmode.singleresponse;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SingleResponse2 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("汽车");
        vehicle.runAir("飞机");
    }
}

class Vehicle2 {
    public void run(String vehice) {
        System.out.println(vehice + "在路上跑");
    }

    public void runAir(String vehice) {
        System.out.println(vehice + "在天上飞");
    }
}

