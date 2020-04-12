package com.xwy.designmode.mode.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuweiyu on 2020-04-10.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class University extends Organization {
    private List<Organization> collages;

    public University(String name, String des) {
        super(name, des);
        collages = new ArrayList<>();
    }

    @Override
    protected void add(Organization organization) {
        super.add(organization);
        collages.add(organization);
    }

    @Override
    protected void delete(Organization organization) {
        super.delete(organization);
        collages.remove(organization);
    }

    @Override
    void print() {
        for (Organization collage : collages) {
            System.out.println(collage);
        }
    }
}
