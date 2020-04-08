package com.xwy.designmode.mode.adapter.objectadapter;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Phone {
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.getVoltage5V() == 5) {
            System.out.println("电压5V开始充电");
        } else if (voltage5V.getVoltage5V() > 5) {
            System.out.println("电压大于5V不能充电");
        } else {
            System.out.println("电压小于于5V不能充电");
        }
    }
}
