package com.source.concrrent.test;

/**
 * @Author LiuYang
 * @Date 2019/5/28/028  11:23
 * @Version 1.0
 **/
public class ProAndCust {
    private static Integer count=0;

    public static class Producer extends Thread{
        @Override
        public void run() {
            synchronized (count){
               count++;
                System.out.println("count:"+count);
               if(count>1){
                   count.notify();
                   System.out.println(Thread.currentThread().getName()+" is notify");
               }
            }
        }
    }

    public static class Consumer extends Thread{
        @Override
        public void run() {
            synchronized (count){
                count--;
                if(count<=0){
                    try {
                        System.out.println(System.currentTimeMillis()+" count:"+count);
                        count.wait();
                        System.out.println(currentThread().getName()+" is wait");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Consumer().start();
        new Producer().start();
    }
}
