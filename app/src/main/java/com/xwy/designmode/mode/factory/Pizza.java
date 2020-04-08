package com.xwy.designmode.mode.factory;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：实现一个pizz的订购，已知pizz的种类有很多，但是整个制作过程是准备-烘焙-切割-打包
 */
public abstract class Pizza {
    public Pizza(){
    }

    public abstract void prepare();

    public void bake(){
        System.out.println("烘焙");
    }

    public void cut(){
        System.out.println("切割");
    }

    public void box(){
        System.out.println("打包");
    }
}
