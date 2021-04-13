package com.leetCode.algorithms.book.dataStructure;

public class QueueByLinked<T> {
    private Node<T> head;
    private Node<T> tail;


    public void offer(T t){
        Node<T> newNode = new Node<>(t);

        if (head == null){
            head = tail = newNode;
            return;
        }

        if (tail != null){
            tail.next = newNode;
            tail = newNode;
        }

    }

    public T poll(){
        if (head == null){
            return null;
        }
        Node<T> tmp = head;
        head = head.next;
        return tmp.t;
    }

    public void print(){
        Node<T> currentNode =  head;

        while (currentNode != null){
            System.out.println(currentNode.t);
            currentNode = currentNode.next;
        }
    }

    private static class Node<T>{
        private T t;
        private Node<T> next;

        public Node(T t) {
            this.t = t;
        }
    }
}
