package com.xwy.designmode.mode.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by xuweiyu on 2020-04-05.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Wolf1 implements Serializable {
    public String name;
    public Sheep1 food;

    public Wolf1(String name) {
        this.name = name;
    }

    //推荐
    public Object deepClone(){
        ByteArrayOutputStream bos= null;//字节数组输出流
        ObjectOutputStream oos = null;//对象输出流
        ByteArrayInputStream bis = null;//字节数组输入流
        ObjectInputStream ois = null;//对象输入流
        bos = new ByteArrayOutputStream();
        try {
            //将对象转为流
            oos = new ObjectOutputStream(bos);
            //将当前对象以流的方式输出，如果当前对象的属性是引用类型也会以流的方式输出
            oos.writeObject(this);
            //将流转为对象
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            //将流中的字节数组转换为对象
            Wolf1 wolf1= (Wolf1) ois.readObject();
            return wolf1;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {//关闭资源
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", food hashCode=" + food.hashCode() +
                '}';
    }
}
