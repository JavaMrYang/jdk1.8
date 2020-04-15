package com.source.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author LiuYang
 * @Date 2020/3/19/019  16:27
 * @Version 1.0
 **/
public class MySemaphore extends Thread {
   Semaphore position;
   private int id;
   public MySemaphore(int i,Semaphore position){
      this.id=i;
      this.position=position;
   }

   @Override
   public void run() {
      try {
         if(position.availablePermits()>0){
             System.out.println("顾客["+this.id+"]进入厕所，有空位");
         }else {
            System.out.println("顾客["+this.id+"]进入厕所，没空位，排队");
         }
         position.acquire();
         System.out.println("顾客["+this.id+"]获得坑位");
         Thread.sleep((int)(Math.random()*1000));
         System.out.println("顾客["+this.id+"]使用完毕");
         position.release();
      }catch (Exception e){
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      ExecutorService service= Executors.newCachedThreadPool();
      Semaphore semaphore=new Semaphore(2);
      for (int i=0;i<10;i++){
         service.submit(new MySemaphore(i+1,semaphore));
      }
      service.shutdown();
      semaphore.acquireUninterruptibly(2);
      System.out.println("使用完毕，需要清扫了");
      semaphore.release(2);
   }
}
