package com.xwy.designmode.mode.facade;

/**
 * Created by xuweiyu on 2020-04-12.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class DvdPlayer {
    private static DvdPlayer instance = new DvdPlayer();

    private DvdPlayer() {
    }

    public static DvdPlayer getInstance() {
        return instance;
    }

    public void turnOn() {
        System.out.println("dvd打开");
    }

    public void turnOff() {
        System.out.println("dvd关闭");
    }

    public void play() {
        System.out.println("dvd播放");
    }

    public void pause() {
        System.out.println("dvd暂停");
    }
}
