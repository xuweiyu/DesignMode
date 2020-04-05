package com.xwy.designmode.mode.prototype.impove;

/**
 * Created by xuweiyu on 2020-04-05.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class CloneTest {
    public static void main(String[] args){
        Sheep sheep = new Sheep("tome", "白色", 1);
        sheep.setFriend(new Sheep("Jim", "黑色", 2));
        Sheep[] list = new Sheep[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (Sheep) sheep.clone();
        }
        for (Sheep item : list) {
            System.out.println(item);
        }
    }
}
