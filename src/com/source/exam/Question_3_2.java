package com.source.exam;

/**
 * @Author LiuYang
 * @Date 2020/2/19/019  13:04
 * @Version 1.0
 **/
public class Question_3_2 {
  public static void main(String args[]) {
    Question_3_2 q = new Question_3_2();
    int i = 2;
    q.method(i);
    i = 4;
  }
  void method(int i) {
    class A {
      void helper() {
        System.out.println(i);
      }
    }
    new A().helper();
  }
}
