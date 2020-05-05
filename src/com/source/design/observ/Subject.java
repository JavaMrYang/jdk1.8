package com.source.design.observ;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:18
 * @Version 1.0
 **/
public interface Subject {

  /**
   * 注册一个观察者
   * @param observer
   */
  void registObserver(Observer observer);

  /**
   * 移除一个观察者
   * @param observer
   */
  void removeObserver(Observer observer);

  /**
   * 通知所有观察者
   * @param
   */
  void notifyObservers();
}
