package com.leetCode.algorithms.book.dataStructure;

import java.util.Arrays;

public class ArrayList<T> {
    private int CAPACITY = 10;
    private Object[] arr = new Object[CAPACITY];
    private int realSize = 0;

    public ArrayList(int capacity) {
        this.CAPACITY = capacity;
    }

    public ArrayList() {
    }


    public void add(T t){
        if (realSize + 1 == CAPACITY)
            arr = Arrays.copyOf(arr, CAPACITY * 2);

        arr[realSize++] = t;
    }

    public void add(int index, T t){
        if (realSize + 1 == CAPACITY)
            arr = Arrays.copyOf(arr, CAPACITY * 2);

        for (int i = realSize; i >= index; i--)
            arr[i] = arr[i - 1];

        arr[index] = t;
    }

    public T get(int index){
        if (index > realSize-1)
            return null;

        return (T) arr[index];
    }
    public T getFirst(){
        return (T) arr[0];
    }

    public T getLast(){
        return (T) arr[realSize-1];
    }

    public void remove(int index){
        if (index == realSize - 1)
            arr[index] = null;

        for (int i = index; i < realSize; i++)
            arr[i] = arr[i + 1];

        arr[realSize-- ] = null;

    }

    public void print(){
        System.out.println(Arrays.toString(arr));
    }

    public int size(){
        return realSize;
    }
}
