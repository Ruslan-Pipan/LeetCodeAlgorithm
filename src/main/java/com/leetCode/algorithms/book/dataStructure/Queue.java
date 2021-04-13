package com.leetCode.algorithms.book.dataStructure;

import java.util.Arrays;

public class Queue<T> {
    private int CAPACITY = 10;
    private Object[] arr = new Object[CAPACITY];
    private int realSize = 0;

    public Queue(int capacity) {
        this.CAPACITY = capacity;
    }

    public Queue() {
    }

    public T pull(){
        T t = (T) arr[0];

        if (realSize >= 1){

            for (int i = 1; i < realSize; i++)
                arr[i - 1] = arr[i];

        } else if (realSize == -1) return null;

        arr[--realSize] = null;
        return t;
    }

    public void offset(T t){
        if (realSize + 1 == CAPACITY){
           arr = Arrays.copyOf(arr,CAPACITY*=2);
        }
        arr[realSize++] = t;
    }
    public void printArr(){
        System.out.println(Arrays.toString(arr));
    }
}
