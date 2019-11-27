package com.source.jdkcode.test;

import com.source.jdkcode.List;
import com.source.jdkcode.interfaces.IList;

/**
 * @Author LiuYang
 * @Date 2019/9/25/025  10:57
 * @Version 1.0
 **/
public class ListTest {
    public static void main(String[] args) {
        IList<String> list=new List.ArrayList<>();
        list.add("ss");
        list.add("hh");
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
