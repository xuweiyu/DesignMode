package com.xwy.designmode.mode.prototype.deepclone;

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

    public Sheep(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
