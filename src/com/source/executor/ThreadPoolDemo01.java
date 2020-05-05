package com.source.executor;

import java.io.Console;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  12:43
 * @Version 1.0
 **/
public class ThreadPoolDemo01 {

  public static void main(String[] args) {
         ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(5,20,2,
                      TimeUnit.SECONDS,new LinkedBlockingDeque<>(5));
         for(int i=0;i<20;i++){
            poolExecutor.execute(new DemoTask(i));
            System.out.println("poolSize:" + poolExecutor.getPoolSize());
            System.out.println("corePoolSize:" + poolExecutor.getCorePoolSize());
            System.out.println("maximumPoolSize:" + poolExecutor.getMaximumPoolSize());
            System.out.println("queue:" + poolExecutor.getQueue().size());
            System.out.println("completedTaskCount:" + poolExecutor.getCompletedTaskCount());
            System.out.println("largestPoolSize:" + poolExecutor.getLargestPoolSize());
            System.out.println("keepAliveTime:" + poolExecutor.getKeepAliveTime(TimeUnit.SECONDS));
         }
         poolExecutor.shutdown();
  }

}
class DemoTask extends Thread{
  private int taskNum;

  public DemoTask(int taskNum){
      this.taskNum=taskNum;
  }

  @Override
  public void run() {
    System.out.println("正在执行" + taskNum+"=20");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("执行完毕" + taskNum+"=20");

  }
}
