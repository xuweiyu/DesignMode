package com.xwy.designmode.lreplace;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Replace {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3 = " + a.function(11, 3));

        B b = new B();
        System.out.println("11-3 = " + b.function(11, 3));
        System.out.println("11-3+9 = " + b.function2(11, 3));
    }
}

class A {
    int function(int a, int b) {
        return a - b;
    }
}

class B extends A {
    int function(int a, int b) {
        return a + b;
    }

    int function2(int a, int b) {
        return function(a, b) + 9;
    }
}
