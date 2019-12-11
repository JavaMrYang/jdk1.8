package com.source.executor;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author LiuYang
 * @Date 2019/12/10/010  16:24
 * @Version 1.0
 **/
public class CompleteTest {

  private static void  whenComplete() throws Exception {
    CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
      }
      if(new Random().nextInt()%2>=0) {
        int i = 12/0;
      }
      System.out.println("run end ...");
    });

    future.whenComplete(new BiConsumer<Void, Throwable>() {
      @Override
      public void accept(Void t, Throwable action) {
        System.out.println("执行完成！");
      }

    });
    future.exceptionally(new Function<Throwable, Void>() {
      @Override
      public Void apply(Throwable t) {
        System.out.println("执行失败！"+t.getMessage());
        return null;
      }
    });

    TimeUnit.SECONDS.sleep(2);
  }

  private static void thenApply() throws Exception {
    CompletableFuture<Long> future = CompletableFuture.supplyAsync(new Supplier<Long>() {
      @Override
      public Long get() {
        long result = new Random().nextInt(100);
        System.out.println("result1="+result);
        return result;
      }
    }).thenApply(new Function<Long, Long>() {
      @Override
      public Long apply(Long t) {
        long result = t*5;
        System.out.println("result2="+result);
        return result;
      }
    });

    long result = future.get();
    System.out.println(result);
  }

  public static void main(String[] args) throws Exception {
      whenComplete();

      thenApply();
  }
}
