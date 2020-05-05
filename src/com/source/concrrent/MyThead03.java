package com.source.concrrent;

/**
 * @Author LiuYang
 * @Date 2019/5/28/028  11:15
 * @Version 1.0
 * 测试synchronized的wait和notify的方法
 **/
public class MyThead03 {

    private final static Object object=new Object();
    public static class T1 extends Thread{
        @Override
        public void run() {
            synchronized (object){
                System.out.println(System.currentTimeMillis()+"T1 start");
                try {
                    System.out.println(System.currentTimeMillis()+"T1 wait");
                    object.wait();
                    System.out.println("线程T1等待结束.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+" T1 end");
            }
        }
    }

    public static class T2 implements Runnable{
        @Override
        public void run() {
            synchronized (object){
                System.out.println(System.currentTimeMillis()+"T2 start");
                object.notify();
                System.out.println("线程对象唤醒");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+" T2 end");
            }
        }
    }

    public static void main(String[] args) {
        T1 t1=new T1();
        t1.start();

        Thread t2=new Thread(new T2());
        t2.start();
    }
}
