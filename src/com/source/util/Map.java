package com.source.util;

import java.util.Collection;
import java.util.Set;

/**
 * @Author LiuYang
 * @Date 2019/5/22/022  14:50
 * @Version 1.0
 **/
public interface Map<K,V> {
    int size();

    boolean isEmpty();

    boolean containsKey(Object var1);

    boolean containsValue(Object var1);

    V get(Object var1);

    V put(K var1, V var2);

    V remove(Object var1);

    void putAll(java.util.Map<? extends K, ? extends V> var1);

    void clear();

    Set<K> keySet();

    Collection<V> values();

    Set<java.util.Map.Entry<K, V>> entrySet();

    boolean equals(Object var1);

    int hashCode();

    public interface Entry<K,V>{
        K getKey();

        V getValue();

        V setValue(V var1);

        boolean equals(Object var1);

        int hashCode();
    }
}
