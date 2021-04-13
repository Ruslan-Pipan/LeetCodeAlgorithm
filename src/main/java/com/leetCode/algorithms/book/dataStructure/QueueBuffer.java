package com.leetCode.algorithms.book.dataStructure;

import java.util.Arrays;

public class QueueBuffer<T> {
    private int CAPACITY = 10;
    private Object[] object;


    private int head = 0;
    private int tail = 0;


    public QueueBuffer() {
        object = new Object[CAPACITY];
    }

    public QueueBuffer(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        object = new Object[CAPACITY];
    }

    public T pull(){
        T tmp = (T) object[head];
        object[head++] = null;

        return tmp;
    }

    public void offset(T t){

        if (tail + 1 > CAPACITY){
            if(head == 0) throw new ArrayIndexOutOfBoundsException();
            tail = 0;
        }

        if (head != 0 && tail != 0 && head == tail) throw new ArrayIndexOutOfBoundsException();

        object[tail++] = t;

    }

    public void print(){
        System.out.println(Arrays.toString(object));
    }
}
