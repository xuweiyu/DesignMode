package com.xwy.designmode.mode.composite.source;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuweiyu on 2020-04-12.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Client {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"三国演义");
        Map<Integer,String> newMap = new HashMap<>();
        newMap.put(1,"红楼梦");
        newMap.put(2,"水浒传");
        map.putAll(newMap);
        System.out.println(map);
    }
}
