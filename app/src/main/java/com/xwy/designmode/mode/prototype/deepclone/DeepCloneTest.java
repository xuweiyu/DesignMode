package com.xwy.designmode.mode.prototype.deepclone;

/**
 * Created by xuweiyu on 2020-04-05.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class DeepCloneTest {
    public static void main(String[] args) {
//        Wolf wolf = new Wolf("金刚狼");
//        wolf.food = new Sheep("喜洋洋","白色",3);
//        Wolf[] list = new Wolf[10];
//        for (int i = 0; i < list.length; i++) {
//            list[i] = (Wolf) wolf.clone();
//        }
//        for (Wolf item : list) {
//            System.out.println(item);
//        }

        Wolf1 wolf = new Wolf1("金刚狼");
        wolf.food = new Sheep1("喜洋洋","白色",3);
        Wolf1[] list = new Wolf1[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (Wolf1) wolf.deepClone();
        }
        for (Wolf1 item : list) {
            System.out.println(item);
        }
    }
}
