package com.xwy.designmode.mode.singleton;

/**
 * Created by xuweiyu on 2020-04-02.
 * email: xuweiyu@igengmei.com
 * 简介：懒汉式
 */
public class LazyTest {
    public static void main(String[] args) {
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy1.hashCode()==lazy2.hashCode());
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

