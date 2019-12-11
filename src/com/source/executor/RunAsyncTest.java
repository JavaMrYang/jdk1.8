package com.source.executor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @Author LiuYang
 * @Date 2019/12/10/010  15:50
 * @Version 1.0
 **/
public class RunAsyncTest {

  /**
   * 无返回值
   * @throws ExecutionException
   * @throws InterruptedException
   */
  private static void runAsync() throws ExecutionException, InterruptedException {
    CompletableFuture<Void> future=CompletableFuture.runAsync(()->{
      try {
        TimeUnit.SECONDS.sleep(1);
      }catch (InterruptedException e){
        System.out.println("run exception");
      }
      System.out.println("run end ....");
    });

    System.out.println(future.get());
  }

  private static void supplyAsync() throws ExecutionException, InterruptedException {
    CompletableFuture<Long> future=CompletableFuture.supplyAsync(()->{
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
      }
      System.out.println("run end ....");
      return System.currentTimeMillis();
    });

    System.out.println(future.isDone());
    long time=future.get();
    System.out.println("time:"+time);
  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
      runAsync();
      supplyAsync();
  }

}
