package com.source.design.single;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  15:50
 * @Version 1.0
 * 单例模式安全的两种
 **/
public class SingleDemo01 {

  private static SingleDemo01 singleDemo01=null;

  /**
   * 单例模式懒汉式双重校验锁
   * @return
   */
  public SingleDemo01 getInstance(){
    if(singleDemo01==null){
        synchronized(this){
          if(singleDemo01==null){
            singleDemo01=new SingleDemo01();
          }
        }
    }
    return singleDemo01;
  }
  private SingleDemo01(){

  }

  /**
   * 静态内部类饿汗模式
   */
  private static class SingleHolder{
     public static SingleDemo01 singleDemo01=new SingleDemo01();
  }
  public SingleDemo01 getInstance1(){
      if(singleDemo01==null){
         return SingleHolder.singleDemo01;
      }
      return singleDemo01;
  }
}
