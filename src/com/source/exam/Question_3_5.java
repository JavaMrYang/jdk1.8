package com.source.exam;

/**
 * @Author LiuYang
 * @Date 2020/2/19/019  13:09
 * @Version 1.0
 **/
class A {
  class B {
    class C {
      void go() {
        System.out.println("go!");
      }
    }
  }
}
public class Question_3_5 {
  public static void main(String[] args) {
    A a = new A();
    //A.B b = a.new A.B();
    // 1
    //B.C c = b.new C(); // 2
   // c.go(); // 3
  }
}
