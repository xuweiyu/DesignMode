package com.xwy.designmode.lreplace;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Replace1 {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println("11-3 = " + a.function(11, 3));

        B1 b = new B1();
        System.out.println("11+3 = " + b.function(11, 3));
        System.out.println("11-3+9 = " + b.function2(11, 3));
    }
}

class Base {
    //一些共有的东西
}

class B1 extends Base {
    private A1 a1 = new A1();

    int function(int a, int b) {
        return a + b;
    }

    int function2(int a, int b) {
        return a1.function(a, b) + 9;
    }
}

class A1 extends Base {
    int function(int a, int b) {
        return a - b;
    }
}
