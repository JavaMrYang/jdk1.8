package com.source.design.factory;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:01
 * @Version 1.0
 **/
public class Courier implements Sender {

  @Override
  public void send() {
    System.out.println("我是快递员配送");
  }
}
