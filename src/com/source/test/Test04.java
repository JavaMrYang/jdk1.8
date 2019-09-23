package com.source.test;

/**
 * @Author LiuYang
 * @Date 2019/5/29/029  17:57
 * @Version 1.0
 **/
class B{
    private Double h=89d;
    private Integer l=9;
    B(double h,int l){
        this.h=h;
        this.l=l;
    }
}
public class Test04 extends B{
    private String str="kl";
    public Test04(double h, int l,String str) {
        super(h, l);
        this.str=str;
    }

    public static void main(String[] args) {

    }
}
