package com.xwy.designmode.mode.decorator.source;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by xuweiyu on 2020-04-09.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class StreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new FileInputStream(new File("xxx"));
        DataInputStream dis = new DataInputStream(is);
    }
}
