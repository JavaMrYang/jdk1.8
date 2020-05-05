package com.source.design.observ;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:27
 * @Version 1.0
 * 模拟两个使用者
 **/
public class Observer1 implements Observer{

  private Subject subject;

  public Observer1(Subject subject){
    this.subject=subject;
    this.subject.registObserver(this);
  }

  @Override
  public void update(String msg) {
    System.out.println("observer1得到一条消息:"+msg);
  }
}
