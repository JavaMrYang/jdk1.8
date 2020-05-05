package com.source.design.factory;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:03
 * @Version 1.0
 **/
public class Pigeon implements Sender{

  @Override
  public void send() {
    System.out.println("飞鸽传书配送");
  }
}
