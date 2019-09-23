package com.source.concrrent;

/**
 * @Author LiuYang
 * @Date 2019/5/28/028  10:55
 * @Version 1.0
 **/
class MyRunable implements Runnable{


    @Override
    public void run() {
        System.out.println("MyRunnable is running");
    }
}

public class MyThread01 extends Thread {
    private int count;
    @Override
    public void run() {
        while (count<=5){
            count++;
            if(count==5){
                /*try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("thread is interrupt");
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName()+" is run "+count);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new MyThread01();
        thread.start();
        //如果在循环体中出现了wait()或者sleep()这样操作的时候，中断可能会被忽略。
        Thread.sleep(3000);
        //中断标志
        thread.interrupt();

       /* Thread thread1=new Thread(new MyRunable());
        thread1.start();*/
    }
}
