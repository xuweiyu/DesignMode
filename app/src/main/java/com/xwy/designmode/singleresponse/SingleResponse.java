package com.xwy.designmode.singleresponse;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：职责单一原则
 */
public class SingleResponse {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

class Vehicle {
    public void run(String vehice) {
        System.out.println(vehice + "在路上跑");
    }
}
