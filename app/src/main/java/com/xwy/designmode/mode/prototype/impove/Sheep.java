package com.xwy.designmode.mode.prototype.impove;

import androidx.annotation.NonNull;

/**
 * Created by xuweiyu on 2020-04-05.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Sheep implements Cloneable{
    public String name;
    public String color;
    public int age;
    public Sheep friend;//对象属性

    public Sheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    //使用默认的方式克隆克隆，下面的代码只是为了方便观察，不做任何修改也可以实现
    @NonNull
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", friend hashCode=" + friend.hashCode() +
                '}';
    }
}
