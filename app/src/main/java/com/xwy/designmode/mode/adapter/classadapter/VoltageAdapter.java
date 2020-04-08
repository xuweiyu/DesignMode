package com.xwy.designmode.mode.adapter.classadapter;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int getVoltage5V() {
        int sourceVoltage = output220V();
        int targetVoltage = stepDown(sourceVoltage);
        return targetVoltage;
    }

    private int stepDown(int sourceVoltage) {
        System.out.println("进行降压处理");
        return sourceVoltage / 44;
    }
}
