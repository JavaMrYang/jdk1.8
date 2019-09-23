package com.source.util;

import java.util.*;

/**
 * @Author LiuYang
 * @Date 2019/5/22/022  14:49
 * @Version 1.0
 **/
public class HashTable<K,V> extends Dictionary<K,V> implements Map<K,V>{
    private transient int modCount = 0;

    private transient Entry<?,?>[] table;

    private static final int KEYS = 0;
    private static final int VALUES = 1;
    private static final int ENTRIES = 2;

    private class Enumerator<T> implements Enumeration<T>, Iterator<T>{
        Entry<?,?>[] table=HashTable.this.table;
        int index=table.length;
        Entry<?,?> entry;
        Entry<?,?> lastReturned;
        int type;

        boolean iterator;

        protected int expectedModCount = modCount;

        public Enumerator(int type, boolean iterator) {
            this.type = type;
            this.iterator = iterator;
        }

        @Override
        public boolean hasMoreElements() {
            Entry<?,?> e=entry;
            int i=index;
            Entry<?,?>[] t = table;
            while (e == null && i > 0) {
                e = t[--i];
            }
            entry = e;
            index = i;
            return e != null;
        }

        @Override
        public T nextElement() {
            Entry<?,?> et=entry;
            int i=index;
            HashTable.Entry<?,?>[] t = table;
            /* Use locals for faster loop iteration */
            while (et == null && i > 0) {
                et = t[--i];
            }
            entry = et;
            index = i;
            if (et != null) {
                HashTable.Entry<?,?> e = lastReturned = entry;
                entry = e.next;
                return type == KEYS ? (T)e.key : (type == VALUES ? (T)e.value : (T)e);
            }
            throw new NoSuchElementException("Hashtable Enumerator");
        }

        @Override
        public boolean hasNext() {
            return hasMoreElements();
        }

        @Override
        public T next() {
            return null;
        }
    }


    private static class Entry<K,V> implements Map.Entry<K,V>{

        final int hash;

        final K key;

         V value;

         HashTable.Entry<K,V> next;


        protected Entry(int hash, K key, V value, Entry<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        protected Object clone(){
            return new HashTable.Entry<>(this.hash,this.key,this.value,this.next==null?null:this.next);
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V var1) {
            Objects.requireNonNull(var1);
            V oldValue=this.value;
            this.value=var1;
            return oldValue;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object var1) {
        return false;
    }

    @Override
    public boolean containsValue(Object var1) {
        return false;
    }

    @Override
    public Enumeration<K> keys() {
        return null;
    }

    @Override
    public Enumeration<V> elements() {
        return null;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K var1, V var2) {
        return null;
    }

    @Override
    public V remove(Object var1) {
        return null;
    }

    @Override
    public void putAll(java.util.Map<? extends K, ? extends V> var1) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<java.util.Map.Entry<K, V>> entrySet() {
        return null;
    }
}
