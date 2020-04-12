package com.xwy.designmode.mode.facade;

/**
 * Created by xuweiyu on 2020-04-12.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Client {
    public static void main(String[] args) {
        PlayHome playHome = new PlayHome();
        playHome.prepare();
        playHome.play();
    }
}
