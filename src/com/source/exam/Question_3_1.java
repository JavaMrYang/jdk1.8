package com.source.exam;

/**
 * @Author LiuYang
 * @Date 2020/2/19/019  13:03
 * @Version 1.0
 **/
public class Question_3_1 {
  interface ITest { // 1
    void m();
  }
  public static void main(String args[]) {
    ITest t = new ITest() { // 2
      public void m() {
        System.out.println("m()");
      }
    };
    t.m();
  }
}
