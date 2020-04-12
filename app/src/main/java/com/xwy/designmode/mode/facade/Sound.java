package com.xwy.designmode.mode.facade;

/**
 * Created by xuweiyu on 2020-04-12.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Sound {
    private static Sound sound = new Sound();
    private Sound(){

    }
    public static Sound getInstance(){
        return sound;
    }

    public void turnOn() {
        System.out.println("音响打开、连接");
    }

    public void turnOff() {
        System.out.println("音响关闭");
    }

    public void pause() {
        System.out.println("音响暂停");
    }

    public void turnBig(){
        System.out.println("音响调大");
    }
    public void turnSmall(){
        System.out.println("音响调小");
    }
}
