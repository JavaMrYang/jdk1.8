package com.source.lambda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author LiuYang
 * @Date 2019/8/15/015  9:54
 * @Version 1.0
 **/
public class Demo01 {
    public static void main(String[] args) {
        String s="stre";
        //DateTimeFormatter dateTimeFormatter=new DateTimeFormatter();
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println((System.currentTimeMillis()+""+(int)(Math.random()*1000000)).length());

        Map<String,String> map=new ConcurrentHashMap<>();
        System.out.println(((ConcurrentHashMap<String, String>) map).mappingCount());
        Integer i=0;
        System.out.println(0==i);
    }
}
