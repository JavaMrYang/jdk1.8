package com.source.test;

import java.io.Serializable;

/**
 * @Author LiuYang
 * @Date 2019/5/29/029  11:41
 * @Version 1.0
 **/
class Food implements Serializable{
    int good=3;
}
class Fruit extends Food{
    int juice=5;
}

public class Test02 extends Fruit{
    int yellow=4;
    public static void main(String[] args) {
        Test02 t2=new Test02();

    }
}
