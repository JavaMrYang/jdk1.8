package com.source.option;

import java.util.Optional;

/**
 * @Author LiuYang
 * @Date 2019/9/23/023  10:39
 * @Version 1.0
 **/
public class Optional1 {
    public static void main(String[] args) {
        Optional optional=Optional.of("zhangSan");
        System.out.println(optional.isPresent()); //true

        System.out.println(optional.get()); //zhangSan

        System.out.println(optional.orElse("hh"));

        Optional optional1=Optional.empty();
        System.out.println(optional.orElse("11"));
    }

}
