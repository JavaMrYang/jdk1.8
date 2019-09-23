package com.source.concrrent;

import java.util.concurrent.*;

import static sun.nio.cs.Surrogate.MAX;

/**
 * @Author LiuYang
 * @Date 2019/9/20/020  17:59
 * @Version 1.0
 **/
public class ExecuteTest01 {
    public static final int max=10;

    public static void main(String[] args) {
        try {
            fixedThreadPool(4);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void fixedThreadPool(int poolSize) throws ExecutionException, InterruptedException {
        //创建线程池
        ExecutorService service= Executors.newFixedThreadPool(poolSize);
        for(int i = 0; i < MAX; i++){
            //提交任务
            Future<Integer> task = service.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println("执行线程" + Thread.currentThread().getName());
                    return fibc(20);
                }
            });
            //获取执行结果
            System.out.println("第"+i+"次计算，结果为"+task.get());
        }
    }

    //模拟耗时操作，定义一个斐波那契数列
    private static int fibc(int num){
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return  1;
        }
        return fibc(num-1)+fibc(num-2);
    }
}
