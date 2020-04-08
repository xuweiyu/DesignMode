package com.xwy.designmode.mode.prototype.deepclone;


import androidx.annotation.NonNull;

/**
 * Created by xuweiyu on 2020-04-05.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Wolf implements Cloneable {
    public String name;
    public Sheep food;

    public Wolf(String name) {
        this.name = name;
    }

    public void setFood(Sheep food) {
        this.food = food;
    }

    @NonNull
    @Override
    protected Object clone()  {
        Wolf clone = null;
        try {
            clone = (Wolf) super.clone();
            if (food != null) {
                clone.food = (Sheep) food.clone();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return clone;
    }


    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", food hashCode=" + food.hashCode() +
                '}';
    }
}
