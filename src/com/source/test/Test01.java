package com.source.test;

import java.lang.reflect.Array;

/**
 * @Author LiuYang
 * @Date 2019/5/28/028  18:02
 * @Version 1.0
 **/
public class Test01 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int b[]={4,5,6};
        new Test01().go(a,b);
    }

    void go(int []...z){
        System.out.println(z.getClass().getName());
        System.out.println(z.getClass().isArray());
        System.out.println(z.getClass().isLocalClass());
        int[][] y=z;
        System.out.println(z.length);
        printArray(y);
        for (int []a:z){
            System.out.printf(a[0]+" ");
        }
    }

    public void printArray(int [][] y){
       for (int i=0;i<y.length;i++){
           for (int j=0;j<y[i].length;j++){
               System.out.printf(y[i][j]+",");
           }
           System.out.println();
       }
    }
}
