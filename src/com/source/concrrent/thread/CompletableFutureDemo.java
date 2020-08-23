package com.source.concrrent.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Author LiuYang
 * @Date 2020/8/21/021  16:41
 * @Version 1.0
 **/
public class CompletableFutureDemo {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
      System.out.println(Thread.currentThread().getName() + "没有返回,update mysql ok");
    });
    completableFuture.get();
    Integer integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
      System.out.println(Thread.currentThread().getName() + "有返回,insert mysql ok");
      return 1024/0;
    }).whenComplete((t,u)->{
      System.out.println("****t:"+t);
      System.out.println("****u:"+u);
    }).exceptionally(f->{
      System.out.println("****exception:"+f.getMessage());
      return 44444;
    }).get();

    System.out.println(integerCompletableFuture);

  }
}
