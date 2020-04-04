package com.xwy.designmode.mode.factory.abstractfactory;

import com.xwy.designmode.mode.factory.Pizza;

import java.util.Scanner;

/**
 * Created by xuweiyu on 2020-04-04.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public abstract class AbstractFactory {
    abstract Pizza createPizza();


    protected String getType(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
