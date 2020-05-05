package com.source.design.observ;

import com.sun.org.apache.xpath.internal.operations.Or;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:22
 * @Version 1.0
 **/
public class ConcreteSubject implements Subject {

  private List<Observer> list=new CopyOnWriteArrayList<>();

  private String msg;

  public void setMsg(String msg) {
    this.msg = msg;
    notifyObservers();
  }

  @Override
  public void registObserver(Observer observer) {
      list.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
      list.remove(observer);
  }

  @Override
  public void notifyObservers() {
      for(Observer observer1:list){
        observer1.update(msg);
      }
  }
}
