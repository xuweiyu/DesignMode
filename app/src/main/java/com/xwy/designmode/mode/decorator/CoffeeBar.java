package com.xwy.designmode.mode.decorator;

/**
 * Created by xuweiyu on 2020-04-09.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink drink = new JapanCoffee();
        printInfo(drink);
        drink = new Milk(drink);//加一分牛奶
        printInfo(drink);
        drink = new Chocolate(drink);
        printInfo(drink);
    }

    private static void printInfo(Drink drink){
        System.out.println("总花费："+drink.cost());
        System.out.println(drink.getDes());
    }
}
