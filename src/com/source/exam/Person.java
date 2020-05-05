package com.source.exam;

import java.util.concurrent.Callable;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  10:14
 * @Version 1.0
 **/
public class Person implements Callable<Integer> {
  private String name;
  private volatile int process=0;

  public Person(String name){
    this.name=name;
  }
  void saiPao(){

    this.process=100;
    System.out.println(this.name+"跑完了");
  }

  @Override
  public Integer call() throws Exception {
    System.out.println(this.name+"我开始赛跑了，当前进度为"+process);
    for(;this.process<=100;process++){
      if(this.process==100){
        System.out.println(this.name+"跑完了,当前进度为"+process);
        return process;
      }
    }
    return process;
  }
}
