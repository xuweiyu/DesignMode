package com.xwy.designmode.mode.prototype;

/**
 * Created by xuweiyu on 2020-04-05.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class EasyTest {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", "白色", 1);
        Sheep[] list = new Sheep[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = new Sheep(sheep.name, sheep.color, sheep.age);
        }
        for (Sheep temp : list) {
            System.out.println(temp);
        }
    }
}
