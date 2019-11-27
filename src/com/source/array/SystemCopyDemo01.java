package com.source.array;

/**
 * @Author LiuYang
 * @Date 2019/9/25/025  10:49
 * @Version 1.0
 **/
public class SystemCopyDemo01 {
    public static void main(String[] args) {
        String src[] = new String[] { "hello", "huang", "bao", "kang" };
        String dest[] = new String[5];
        System.arraycopy(src, 0, dest, 0, 4);
        for (String str : dest) {
            System.out.println(str);
        }
        System.out.println("=========华丽的分割线=========");
        System.arraycopy(src, 1, src, 2, 2-1);
        for (String str : src) {
            System.out.println(str);
        }
    }
}
