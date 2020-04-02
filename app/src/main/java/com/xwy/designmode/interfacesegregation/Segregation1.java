package com.xwy.designmode.interfacesegregation;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Segregation1 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.dependence(new A1());
        c1.dependence2(new A1());
    }
}

class C1 {
    public void dependence(Interface1 interface1) {
        interface1.method1();
    }

    public void dependence2(Interface2 interface2) {
        interface2.method2();
        interface2.method3();
        interface2.method1();
    }
}

interface Interface1 {
    void method1();
}

interface Interface2 extends Interface1 {
    void method2();

    void method3();
}

interface Interface3 extends Interface1 {
    void method4();

    void method5();
}

class A1 implements Interface2 {

    @Override
    public void method1() {
        System.out.println("A1 实现了method1");
    }

    @Override
    public void method2() {
        System.out.println("A1 实现了method2");
    }

    @Override
    public void method3() {
        System.out.println("A1 实现了method3");
    }
}

class B1 implements Interface3 {

    @Override
    public void method1() {
        System.out.println("B1 实现了method1");
    }

    @Override
    public void method4() {
        System.out.println("B1 实现了method4");
    }

    @Override
    public void method5() {
        System.out.println("B1 实现了method5");
    }
}

