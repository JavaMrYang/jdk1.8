package com.source.jdkcode.interfaces;

/**
 * @Author LiuYang
 * @Date 2019/9/25/025  10:30
 * @Version 1.0
 **/
public interface IList<T> {

    boolean add(T value);

    boolean remove(T value);

    T set(int index,T value);

    T get(int index);

    void clear();

    boolean contains(T value);

    int size();

    boolean validate();

    java.util.List<T> toList();

    java.util.Collection<T> toCollection();
}
