package com.source.util;

import java.util.Enumeration;

/**
 * @Author LiuYang
 * @Date 2019/5/22/022  14:50
 * @Version 1.0
 **/
public abstract class Dictionary<K,V> {
    public Dictionary() {
    }

    public abstract int size();

    public abstract boolean isEmpty();

    public abstract Enumeration<K> keys();

    public abstract Enumeration<V> elements();

    public abstract V get(Object key);

    public abstract V put(K var1,V var2);

    public abstract V remove(Object var1);
}
