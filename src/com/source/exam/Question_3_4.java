package com.source.exam;

/**
 * @Author LiuYang
 * @Date 2020/2/19/019  13:07
 * @Version 1.0
 **/
public class Question_3_4 {
  public static class Inner {
    private void doIt() {
      System.out.println("doIt()");
    }
  }
  public static void main(String[] args) {
    Question_3_4.Inner i = new Inner();
    i.doIt();
  }
}

