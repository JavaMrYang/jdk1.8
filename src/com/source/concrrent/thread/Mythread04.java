package com.source.concrrent.thread;

/**
 * @Author LiuYang
 * @Date 2020/8/21/021  16:04
 * @Version 1.0
 **/
public class Mythread04 {

  public static void main(String[] args) {
    new ExecuteThread().start();
    new ExecuteThread().start();
  }

  public static void test01() {
    synchronized (Mythread04.class) {
      String name = Thread.currentThread().getName();
      System.out.println(name + "进入了同步代码块2");
    }
  }
  static class ExecuteThread extends Thread{

    @Override
    public void run() {
      synchronized (Mythread04.class) {
        System.out.println(getName() + "进入了同步代码块1");

        Mythread04.test01();
      }
    }
  }
}
