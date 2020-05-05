package com.source.design.factory;

/**
 * @Author LiuYang
 * @Date 2020/4/24/024  16:06
 * @Version 1.0
 * 简单工厂类
 **/
public class SingleFactory {

  public static Sender createSender(String type){
    Sender sender=null;
    if("courier".equalsIgnoreCase(type)){
        sender=new Courier();
    }
    if("hourse".equalsIgnoreCase(type)){
       sender=new Hourse();
    }
    if("pigeon".equalsIgnoreCase(type)){
      sender=new Pigeon();
    }
    return sender;
  }
}
