package com.xwy.designmode.singleresponse;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SingleResponse1 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

class RoadVehicle{
    public void run(String vehice) {
        System.out.println(vehice + "在路上跑");
    }
}

class AirVehicle{
    public void run(String vehice) {
        System.out.println(vehice + "在天上飞");
    }
}
