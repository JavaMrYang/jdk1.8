package com.source.design.factory;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:09
 * @Version 1.0
 **/
public class FactoryTest {

  public static void main(String[] args) {
    Sender sender=SingleFactory.createSender("hourse");
    sender.send();
  }
}
