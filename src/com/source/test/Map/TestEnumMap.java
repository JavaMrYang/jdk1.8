package com.source.test.Map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Author LiuYang
 * @Date 2019/5/30/030  15:49
 * @Version 1.0
 **/
public class TestEnumMap {
    private static final String prefix="prefix";

    private SortedMap sortedMap;
    private static final int SIZE=5;
    public TestEnumMap(){
        sortedMap=new TreeMap();

       /* Comparator comparator=(t1,t2)->{
            if(!(t1 instanceof Integer)||!(t2 instanceof Integer)){
                return
            }
        }*/
        for (int i=0;i<SIZE;i++)
            sortedMap.put(prefix+"_"+i,"val"+i);
    }

    public static void main(String[] args) {
        TestEnumMap testEnumMap=new TestEnumMap();
        System.out.println(testEnumMap.sortedMap.lastKey());
        TreeMap treeMap= (TreeMap) testEnumMap.sortedMap;
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
    }

}
