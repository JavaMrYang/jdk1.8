package com.source.design.observ;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:29
 * @Version 1.0
 **/
public class Observer2 implements Observer {

  private Subject subject;

  public Observer2(Subject subject){
    this.subject=subject;
    this.subject.registObserver(this);
  }

  @Override
  public void update(String msg) {
    System.out.println("observer2得到一条消息:"+msg);
  }
}
