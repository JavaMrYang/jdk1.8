package com.source.design.adapter;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  17:35
 * @Version 1.0
 **/
public class AdapterTest {

  public static void main(String[] args) {
      Mobile mobile=new Mobile();
      V5Power v5Power=new V5PowerAdapter(new V220Power());
      mobile.initPower(v5Power);
  }
}
