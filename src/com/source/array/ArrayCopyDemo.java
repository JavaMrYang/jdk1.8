package com.source.array;

import java.util.Arrays;

/**
 * @Author LiuYang
 * @Date 2019/5/29/029  10:43
 * @Version 1.0
 * 数组拷贝的例子
 **/
public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(new String(copyTo));

        char[] copyTo2= Arrays.copyOfRange(copyFrom,2,9);
        System.out.println(new String(copyTo2));
    }
}
