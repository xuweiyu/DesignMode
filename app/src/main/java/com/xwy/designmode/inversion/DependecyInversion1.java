package com.xwy.designmode.inversion;

/**
 * Created by xuweiyu on 2020-03-31.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class DependecyInversion1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new Email1());
        person1.receive(new WeChat());
    }
}

class Person1 {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

interface IReceiver {
    String getInfo();
}

class Email1 implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件:hello world";
    }
}

class WeChat implements IReceiver {

    @Override
    public String getInfo() {
        return "微信消息:hello wechat";
    }
}

