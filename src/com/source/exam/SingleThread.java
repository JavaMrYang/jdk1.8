package com.source.exam;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  15:30
 * @Version 1.0
 **/
public class SingleThread {

  public static void main(String[] args) {
     Future<Integer> fA=new FutureTask<>(new Person("A"));
     Future<Integer> fB=new FutureTask<>(new Person("B"));
     Future<Integer> fC=new FutureTask<>(new Person("C"));
     Thread threadA=new Thread((Runnable) fA);
     Thread threadB=new Thread((Runnable) fB);
     Thread threadC=new Thread((Runnable) fC);
     threadA.start();
     threadB.start();
     threadC.start();
     try {
       Thread.sleep(1000);
       if(fA.isDone()){
         System.out.println("线程A已经做完，结果是:"+fA.get());
       }
       if(fB.isDone()){
         System.out.println("线程B已经做完，结果是:"+fB.get());
       }
       if(fC.isDone()){
         System.out.println("线程C已经做完，结果是:"+fC.get());
       }
       if(fA.isDone()&&fB.isDone()&&fC.isDone()){
         System.out.println("整个线程都跑完了");
       }
     }catch (Exception e){

     }

  }

}
