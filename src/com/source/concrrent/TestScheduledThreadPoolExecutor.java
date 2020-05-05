package com.source.concrrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author LiuYang
 * @Date 2020/4/22/022  11:02
 * @Version 1.0
 **/
public class TestScheduledThreadPoolExecutor {

  public static void main(String[] args) {
   ScheduledExecutorService exec = new ScheduledThreadPoolExecutor(1);//线程池大小为1，顺序执行

    exec.scheduleAtFixedRate(new Runnable() {
      @Override
      public void run() {//每隔一段时间就触发异常
        throw new RuntimeException();
        //System.out.println("================");
      }
    }, 1000, 6000, TimeUnit.MILLISECONDS);

   /* exec.scheduleAtFixedRate(new Runnable() {//每隔一段时间打印系统时间，证明两者是互不影响的
      @Override
      public void run() {
        System.out.println(System.currentTimeMillis());
      }
    }, 1000, 2000, TimeUnit.MILLISECONDS);*/
  }

}
