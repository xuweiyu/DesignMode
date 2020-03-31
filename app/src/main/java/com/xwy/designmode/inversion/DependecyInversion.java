package com.xwy.designmode.inversion;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：依赖倒转原则
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        //如果这里接收的有其他类型的信息则需要新建信息类而且还需要增加接收方法扩展性和稳定性很差
        persion.receive(new Email());
    }
}

class Persion {
    void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件:hello world";
    }
}
