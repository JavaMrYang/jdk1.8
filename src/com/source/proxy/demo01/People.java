package com.source.proxy.demo01;

/**
 * @Author LiuYang
 * @Date 2019/8/2/002  11:28
 * @Version 1.0
 **/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 创建一个接口People，包含一个work方法，方法的返回对象是它本身
 */
public interface People {

    People work(String workName);

    String time();
}

class Student implements People{

    @Override
    public People work(String workName) {
        System.out.println("工作内容是:"+workName);
        return this;
    }

    @Override
    public String time() {
        return "2019-08-02";
    }
}
class Test{
    public static void main(String[] args) {
        People people = new Student();
        InvocationHandler handler = new WorkHandler(people);

        People proxy = (People) Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(), handler);
        People p = proxy.work("写代码").work("开会").work("上课");

        System.out.println("打印返回的对象");
        System.out.println(p.getClass());

        String time = proxy.time();
        System.out.println(time);
    }
}
