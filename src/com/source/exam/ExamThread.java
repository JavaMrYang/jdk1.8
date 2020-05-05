package com.source.exam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  10:14
 * @Version 1.0
 **/
public class ExamThread  {

  private Person person;

  public ExamThread(Person p){
    this.person=p;
  }
  /*@Override
  public void run() {
    person.saiPao();
  }*/

  public static void main(String[] args) {
    ExecutorService service = Executors.newSingleThreadExecutor();
    Future<Integer> futureA=service.submit(new Person("A"));
    Future<Integer> futureB=service.submit(new Person("B"));
    Future<Integer> futureC=service.submit(new Person("C"));
    try {
      Thread.sleep(1000);
      Integer resultA=0,resultB=0,resultC=0;
      if(futureA.isDone()){
        resultA=futureA.get();
        System.out.println("A线程已经做完了,结果是:"+resultA);
      }
      if(futureB.isDone()){
        resultB=futureB.get();
        System.out.println("B线程已经做完了,结果是:"+resultB);
      }
      if(futureC.isDone()){
        resultC=futureC.get();
        System.out.println("C线程已经做完了,结果是:"+resultC);
      }
      if(resultA.equals(100)&&resultB.equals(100)&&resultC.equals(100)){
        System.out.println("整个线程跑完了,结果分别是:"+resultA+","+resultB+","+resultC);
      }
      service.shutdown();
    }catch (Exception e){

    }

    ;
    /*Thread threadA=new ExamThread(new Person("A"));
    Thread threadB=new ExamThread(new Person("B"));
    Thread threadC=new ExamThread(new Person("C"));
    threadA.start();
    threadB.start();
    threadC.start();*/
  }
}
