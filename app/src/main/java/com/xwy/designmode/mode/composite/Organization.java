package com.xwy.designmode.mode.composite;

/**
 * Created by xuweiyu on 2020-04-10.
 * email: xuweiyu@igengmei.com
 * 简介：组织
 */
public abstract class Organization {
    public String name;
    public String des;

    public Organization(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(Organization organization) {
        //设定为默认实现而不是接口是因为专业作为叶子节点是不需要进行增加操作的
    }

    protected void delete(Organization organization) {

    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    abstract void print();
}
