package com.source.test;

import com.source.test.enumration.ColorEnum;
import com.source.test.enumration.Day;

import java.util.EnumMap;

/**
 * @Author LiuYang
 * @Date 2019/5/30/030  15:27
 * @Version 1.0
 **/
public class EnumMapTest {

    public static void main(String[] args) {
        Day today=Day.FRIDAY;

        EnumMap enummap=new EnumMap(Day.class); //对应Day类的EnumMap
        enummap.put(Day.MONDAY, "work work");   //第一个值为key不能为null，第二个值为values可以为null
        enummap.put(Day.TUESDAY, "work work");  //第一个值填入枚举实例，第二个值为该枚举实例的记录信息
        enummap.put(Day.WEDNESDAY, "work work");
        enummap.put(Day.THURSDAY, "work work");
        enummap.put(Day.FRIDAY, "work work");
        enummap.put(Day.SATURDAY, "have fun");
        enummap.put(Day.SUNDAY, "have fun");

       // System.out.println(enummap);

        String job=(String) enummap.get(today); //用get方法输入key值获得今天的工作信息
        //System.out.println("job is:"+job);
        enummap.forEach((k,v)->{
            System.out.printf("key=%s,value=%s",k,v);
            System.out.println();
        });
    }
}
