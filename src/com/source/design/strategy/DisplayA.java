package com.source.design.strategy;

/**
 * @Author LiuYang
 * @Date 2020/8/6/006  16:47
 * @Version 1.0
 **/
public class DisplayA implements IDisplayBehavior {

  @Override
  public void display() {
    System.out.println("样子1");
  }
}
