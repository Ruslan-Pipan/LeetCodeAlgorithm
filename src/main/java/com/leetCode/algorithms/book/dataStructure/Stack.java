package com.leetCode.algorithms.book.dataStructure;

import java.util.Arrays;

public class Stack<T> {

    private int CAPACITY = 10;
    private Object[] arr = new Object[CAPACITY];
    private int realSize = 0;

    public Stack(int capacity){
        CAPACITY = capacity;
    }

    public void push(T t){
        if (realSize + 1 == CAPACITY){
            arr = Arrays.copyOf(arr, CAPACITY*=2);
        }

        arr[realSize++] = t;
    }

    public T pop(){
        if (realSize == -1)
            return null;
        else
            return (T) arr[--realSize];
    }

    public boolean isEmpty(){
        return realSize == 0 ? true : false;
    }

    public int size(){
        return realSize;
    }


}
