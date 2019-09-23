package com.source.test.Map;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author LiuYang
 * @Date 2019/5/23/023  15:47
 * @Version 1.0
 **/
public class TestMap {

    private Map<String,String> map;

    void init(Map map){
        if(map instanceof HashMap){
            this.map= (Map) new HashMap<String,String>();
        }else if (map instanceof LinkedHashMap){
            this.map= (Map) new LinkedHashMap<String,String>();
        }else if (map instanceof TreeMap){
            this.map= (Map<String, String>) new TreeMap<String,String>();
        }
        long startTime=System.currentTimeMillis();
        for (int i=0;i<5;i++){
            this.map.put("var"+i,i+"");
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("初始化map所用时间为:%d \n",endTime-startTime);
    }

    void get(){
        long startTime=System.currentTimeMillis();
        this.map.entrySet().forEach(entry->{
            System.out.printf("key:%s,value:%s \n",entry.getKey(),entry.getValue());
        });
        long endTime=System.currentTimeMillis();
        System.out.printf("获取map所用时间为:%d \n",endTime-startTime);
    }

    public static void main(String[] args) {
        TestMap testMap=new TestMap();
        testMap.init((Map) new HashMap<String,String>());
        testMap.get();

        TestMap testMap2=new TestMap();
        testMap2.init((Map) new LinkedHashMap<String,String>());
        testMap2.get();

        TestMap testMap3=new TestMap();
        testMap3.init((Map) new TreeMap<String,String>());
        testMap3.get();
    }
}
