package com.source.design.strategy;

/**
 * @Author LiuYang
 * @Date 2020/8/6/006  16:45
 * @Version 1.0
 **/
public class DefendTBS implements IDefendBehavior {

  @Override
  public void defend() {
    System.out.println("铁布衫");
  }
}
