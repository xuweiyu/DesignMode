package com.xwy.designmode.mode.adapter.objectadapter;

/**
 * Created by xuweiyu on 2020-04-07.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int getVoltage5V() {

        int sourceVoltage = voltage220V.output220V();
        int targetVoltage = stepDown(sourceVoltage);
        return targetVoltage;
    }

    private int stepDown(int sourceVoltage) {
        System.out.println("进行降压处理");
        return sourceVoltage / 44;
    }
}
