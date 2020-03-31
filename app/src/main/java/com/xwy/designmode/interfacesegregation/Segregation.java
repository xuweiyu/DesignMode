package com.xwy.designmode.interfacesegregation;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Segregation {
}

interface ISegregation {
    void method1();

    void method2();

    void method3();

    void method4();

    void method5();
}

class B implements ISegregation {

    @Override
    public void method1() {
        System.out.println("B 实现了 method1");
    }

    @Override
    public void method2() {
        System.out.println("B 实现了 method2");
    }

    @Override
    public void method3() {
        System.out.println("B 实现了 method3");
    }

    @Override
    public void method4() {
        System.out.println("B 实现了 method4");
    }

    @Override
    public void method5() {
        System.out.println("B 实现了 method5");
    }
}

class A implements ISegregation {

    @Override
    public void method1() {
        System.out.println("A 实现了 method1");
    }

    @Override
    public void method2() {
        System.out.println("A 实现了 method2");
    }

    @Override
    public void method3() {
        System.out.println("A 实现了 method3");
    }

    @Override
    public void method4() {
        System.out.println("A 实现了 method4");
    }

    @Override
    public void method5() {
        System.out.println("A 实现了 method5");
    }
}

class D {
    public void dependence1(ISegregation segregation) {
        segregation.method1();
    }

    public void dependence2(ISegregation segregation) {
        segregation.method2();
    }

    public void dependence3(ISegregation segregation) {
        segregation.method3();
    }
}

class C{
    public void dependence1(ISegregation segregation) {
        segregation.method1();
    }

    public void dependence2(ISegregation segregation) {
        segregation.method4();
    }

    public void dependence3(ISegregation segregation) {
        segregation.method5();
    }
}
