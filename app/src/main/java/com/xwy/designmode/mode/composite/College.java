package com.xwy.designmode.mode.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuweiyu on 2020-04-10.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class College extends Organization{
    private List<Organization> departments;
    public College(String name, String des) {
        super(name, des);
        departments = new ArrayList<>();
    }

    @Override
    protected void add(Organization organization) {
        super.add(organization);
        departments.add(organization);
    }

    @Override
    protected void delete(Organization organization) {
        super.delete(organization);
        departments.remove(organization);
    }

    @Override
    void print() {
        for (Organization department : departments) {
            System.out.println(department);
        }
    }
}
