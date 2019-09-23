package com.source.concrrent;

/**
 * @Author LiuYang
 * @Date 2019/5/28/028  11:10
 * @Version 1.0
 **/
public class MyThread02 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Thread running");
            if(Thread.currentThread().isInterrupted()){
                System.out.println("interrput");
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("when sleep interrupt");
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread end");
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new MyThread02());
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
