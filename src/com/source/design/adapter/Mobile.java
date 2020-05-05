package com.source.design.adapter;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  17:29
 * @Version 1.0
 * 适配器模式
 **/
public class Mobile {

    public void initPower(V5Power power){
      int provideV5Power = power.provideV5Power();
      System.out.println("手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V");
    }
}
