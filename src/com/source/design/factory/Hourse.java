package com.source.design.factory;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:04
 * @Version 1.0
 **/
public class Hourse implements Sender {

  @Override
  public void send() {
    System.out.println("骑马配送");
  }
}
