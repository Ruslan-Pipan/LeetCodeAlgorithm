package com.leetCode.algorithms.book.dataStructure;

import java.util.Arrays;

public class PriorityQueue<T> {
    private int capacity = 10;
    private int tail = 0;

    private Object[] arr = new Object[capacity];

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
    }

    public PriorityQueue() {
    }

    public T pull(){
        T tmp = (T) arr[tail];
        arr[tail--] = null;

        return tmp;
    }

    public void offset(T t){

        if (tail == 0){
            arr[tail++] = t;
            return;
        }

        if (tail == capacity)
            arr = Arrays.copyOf(arr, capacity*=2);

        Comparable<T> comparable = (Comparable<T>) t;

        if (comparable.compareTo((T) arr[tail - 1]) >= 0){
            arr[tail++] = t;
            return;
        }

        for (int i = tail - 1; i >=0 ; i--) {
            if (comparable.compareTo((T) arr[i]) >= 0){
                int tmp = tail;

                while (tmp != i)
                    arr[tmp] = arr[--tmp];

                arr[i + 1] = t;
                tail++;
                return;
            }
        }

    }
    public void print(){
        System.out.println(Arrays.toString(arr));
    }

}
