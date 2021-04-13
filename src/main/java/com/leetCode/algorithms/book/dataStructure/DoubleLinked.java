package com.leetCode.algorithms.book.dataStructure;

public class DoubleLinked<T> {
    private Node<T> head;
    private Node<T> tail;

    public void addFirst(T t){
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;

        if (tail == null){
            tail = firstNode;
        }

    }

    public void addLast(T t){
        Node<T> lastNode = new Node<>(t);

        if (head == null){
            head = lastNode;
            return;
        }

        tail.next = lastNode;
        tail = lastNode;

    }


    public void print(){
        Node<T> currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.t);
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return "DoubleLinked{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    private static class Node<T>{
        private Node<T> next;
        private T t;



        public Node(T t) {
            this.t = t;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", t=" + t +
                    '}';
        }
    }
}
