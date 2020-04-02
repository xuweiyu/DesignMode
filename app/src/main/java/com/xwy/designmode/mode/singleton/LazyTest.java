package com.xwy.designmode.mode.singleton;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：懒汉式
 */
public class LazyTest {
    public static void main(String[] args) {

//        Lazy lazy2 = Lazy.getInstance();
        for (int i = 0; i <10000 ; i++) {
            Lazy lazy1 = Lazy.getInstance();
            System.out.println(lazy1.age);
        }
    }
}

//class Lazy {
//    private static Lazy instance;
//
//    private Lazy() {
//
//    }
//
//    public static Lazy getInstance() {
//        if (instance == null) {
//            instance = new Lazy();
//        }
//        return instance;
//    }
//
//}
//class Lazy {
//    private static Lazy instance;
//
//    private Lazy() {
//
//    }
//
//    public static synchronized Lazy getInstance() {
//        if (instance == null) {
//            instance = new Lazy();
//        }
//        return instance;
//    }
//
//}

class Lazy {
    private static volatile Lazy instance;
    public int age = 10;

    private Lazy() {

    }

    public static Lazy getInstance() {
        if (instance == null) {
            synchronized (Lazy.class) {
                if (instance == null) {
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }

}

