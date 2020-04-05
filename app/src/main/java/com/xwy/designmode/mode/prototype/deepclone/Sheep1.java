package com.xwy.designmode.mode.prototype.deepclone;

import java.io.Serializable;

/**
 * Created by xuweiyu on 2020-04-05.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Sheep1 implements Serializable {
    public String name;
    public String color;
    public int age;

    public Sheep1(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
