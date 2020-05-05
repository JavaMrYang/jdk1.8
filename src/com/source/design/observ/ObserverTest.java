package com.source.design.observ;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:31
 * @Version 1.0
 **/
public class ObserverTest {

  public static void main(String[] args) {
    ConcreteSubject concreteSubject=new ConcreteSubject();
    Observer observer1=new Observer1(concreteSubject);
    Observer observer2=new Observer2(concreteSubject);
    concreteSubject.setMsg("我开始做事了");
    concreteSubject.setMsg("我打卡了");
  }
}
