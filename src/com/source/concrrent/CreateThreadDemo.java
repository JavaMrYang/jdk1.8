package com.source.concrrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author LiuYang
 * @Date 2019/12/9/009  18:22
 * @Version 1.0
 * 创建线程的几种方式
 **/
public class CreateThreadDemo {

  public static void main(String[] args) {
    Thread thread1=new Thread(){
      @Override
      public void run() {
        System.out.println("继承Thread");
        super.run();
      }
    };
    thread1.start();

    Thread thread2=new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("实现Runnable接口");
      }
    });
    thread2.start();

    //3.实现callable接口
    ExecutorService service = Executors.newSingleThreadExecutor();
    Future<String> future = service.submit(new Callable() {
      @Override
      public String call() throws Exception {
        return "通过实现Callable接口";
      }
    });
    try {
      String result = future.get();
      System.out.println(result);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

}
