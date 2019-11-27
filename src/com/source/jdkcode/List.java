package com.source.jdkcode;

import com.source.jdkcode.interfaces.IList;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/**
 * @Author LiuYang
 * @Date 2019/9/25/025  10:35
 * @Version 1.0
 **/
public abstract class List<T> implements IList<T> {

    public static class ArrayList<T> extends List<T>{

        private static final int MINIMUM_SIZE = 1024;

        private int size = 0;
        private T[] array = (T[]) new Object[MINIMUM_SIZE];
        @Override
        public boolean add(T value) {
            return add(size,value);
        }

        public boolean add(int index,T value){
            if(size>=array.length){
                grow();
            }else if (index==size){
                array[size]=value;
            }else {
                System.arraycopy(array, index, array, index+1, size - index);
                array[index] = value;
            }

            size++;
            return true;
        }

        private void grow() {
            int growSize = size + (size<<1);
            array = Arrays.copyOf(array, growSize);
        }

        @Override
        public boolean remove(T value) {
            for(int i=0,len=size();i<len;i++){
                T var1=array[i];
                if(var1.equals(value)){
                    remove(i);
                    return true;
                }
            }
            return false;
        }

        private T remove(int index) {
            if (index<0 || index>=size) {
                return null;
            }

            T t = array[index];
            if (index != --size) {
                // Shift the array down one spot
                System.arraycopy(array, index + 1, array, index, size - index);
            }
            array[size] = null;

            int shrinkSize = array.length>>1;
            if (shrinkSize >= MINIMUM_SIZE && size < shrinkSize){
                shrink();
            }
            return t;
        }

        private void shrink() {
            int shrinkSize = array.length>>1;
            array = Arrays.copyOf(array, shrinkSize);
        }

        @Override
        public T set(int index, T value) {
            if(index<0||index>size){
                return value;
            }
            T var1=array[index];
            array[index]=value;
            return var1;
        }

        @Override
        public T get(int index) {
            if(index<0||index>size){
                return null;
            }
            return array[index];
        }

        @Override
        public void clear() {
            size=0;
        }

        @Override
        public boolean contains(T value) {
            for(int i=0,len=size;i<len;i++){
                T obj=array[i];
                if (obj.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean validate() {
            int localSize = 0;
            for (int i=0; i<array.length; i++) {
                T t = array[i];
                if (i<size) {
                    if (t==null){
                        return false;
                    }
                    localSize++;
                } else {
                    if (t!=null){
                        return false;
                    }
                }
            }
            return (localSize==size);
        }

        @Override
        public java.util.List toList() {
            return new JavaCompatibleArrayList<T>(this);
        }

        @Override
        public Collection toCollection() {
            return new JavaCompatibleArrayList<T>(this);
        }
    }

    public static class JavaCompatibleArrayList<T> extends AbstractList<T> implements RandomAccess{
        private List.ArrayList<T> list=null;

        public JavaCompatibleArrayList(ArrayList<T> list) {
            this.list = list;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean add(T value) {
            return list.add(value);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean remove(Object value) {
            return list.remove((T)value);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean contains(Object value) {
            return list.contains((T)value);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public int size() {
            return list.size;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void add(int index, T value) {
            list.add(index, value);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public T remove(int index) {
            return list.remove(index);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public T get(int index) {
            T t = list.get(index);
            if (t!=null){
                return t;
            }
            throw new IndexOutOfBoundsException();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public T set(int index, T value) {
            return list.set(index, value);
        }
    }


}
