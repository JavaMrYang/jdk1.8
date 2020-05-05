package com.source.concrrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author LiuYang
 * @Date 2020/4/22/022  10:43
 * @Version 1.0
 **/
public class MyThread03 extends Thread {

  private static int num;

  private AtomicInteger ai=new AtomicInteger();

  @Override
  public void run() {
    ai.getAndIncrement();

    System.out.println("当前线程"+Thread.currentThread().getName()+",当前num的值为:"+this.num);
  }

  public static void main(String[] args) {
    for(int i=0;i<100;i++){
      new MyThread03().start();
    }
  }
}
