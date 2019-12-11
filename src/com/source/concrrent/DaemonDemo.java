package com.source.concrrent;

/**
 * @Author LiuYang
 * @Date 2019/12/9/009  19:05
 * @Version 1.0
 **/
public class DaemonDemo {
  public static void main(String[] args) {
    Thread daemonThread = new Thread(new Runnable() {
      @Override
      public void run() {
        while (true) {
          try {
            System.out.println("i am alive");
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          } finally {
            System.out.println("finally block");
          }
        }
      }
    });
    daemonThread.setDaemon(true);
    daemonThread.start();
    //确保main线程结束前能给daemonThread能够分到时间片
    try {
      Thread.sleep(800);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
