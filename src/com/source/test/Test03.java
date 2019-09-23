package com.source.test;

/**
 * @Author LiuYang
 * @Date 2019/5/29/029  11:45
 * @Version 1.0
 **/
class Atom{
    Atom(){
        System.out.print("atom ");
    }
}

class Rock extends Atom{
    Rock(String type){
        System.out.print(type);
    }
}

public class Test03 extends Rock{

    Test03() {
       super("grantie ");
       new Rock("grantie ");
    }

    public static void main(String[] args) {
        new Test03();
    }
}
