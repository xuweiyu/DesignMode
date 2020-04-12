package com.xwy.designmode.mode.composite;

/**
 * Created by xuweiyu on 2020-04-10.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Client {
    public static void main(String[] args) {
        University nwpu = new University("西工大","西工大是一所集航空航天航海的大学");
        College college = new College("软件与微电子学院","软件与微电子学院是集软硬件一体的学院");
        Department department = new Department("微电子学","微电子是一门硬件相关的专业");
        college.add(department);
        Department department1 = new Department("软件","软件是一门软件编程的专业");
        college.add(department1);
        College comCollege = new College("计算机学院","计算机学院是与计算机相关的学院");
        Department department2 = new Department("计算机","计算机是一门电脑相关的专业");
        comCollege.add(department2);
        Department department3 = new Department("网络工程","网络工程是一门网络相关的专业");
        comCollege.add(department3);
        nwpu.add(college);
        nwpu.add(college);
//        nwpu.print();
//        college.print();
        department.print();
    }
}
