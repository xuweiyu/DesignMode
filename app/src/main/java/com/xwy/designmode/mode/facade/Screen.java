package com.xwy.designmode.mode.facade;

/**
 * Created by xuweiyu on 2020-04-12.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Screen {
    private static Screen screen = new Screen();
    private Screen(){

    }
    public static Screen getInstance(){
        return screen;
    }


    public void turnOn() {
        System.out.println("屏幕打开");
    }

    public void turnOff() {
        System.out.println("屏幕关闭");
    }

    public void definitionBig() {
        System.out.println("清晰度调高");
    }

    public void definitionSmall() {
        System.out.println("清晰度调低");
    }

}
