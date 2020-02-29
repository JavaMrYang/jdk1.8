package com.source.exam;

/**
 * @Author LiuYang
 * @Date 2020/2/19/019  13:12
 * @Version 1.0
 **/
public class Question_3_6 {
  private class A { // 1
    public int plusTwo(int n) {
      return n + 2;
    }
  }
  public static void main(String[] args) {
    Question_3_6 q = new Question_3_6();
    Question_3_6.A a = q.new A();
    System.out.println(a.plusTwo(3));
    //Question_3_6.A a = new A(); // 2
   // System.out.println(a.plusTwo(3));
  }
}
