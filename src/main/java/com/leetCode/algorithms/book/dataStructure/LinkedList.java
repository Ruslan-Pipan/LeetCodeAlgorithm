package com.leetCode.algorithms.book.dataStructure;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T t){
        Node<T> newNode = new Node<>(t);

        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;

        tail = newNode;
    }

    public void add(T t, int index){
        if (index == 0){
            addFirst(t);
            return;
        }

        Node<T> newNode = new Node<>(t);
        Node<T> currentNode = head;
        int count = 0;

        while (currentNode != null){

            if (count == index){
                Node<T> prevNode = currentNode.prev;
                prevNode.next = newNode;
                newNode.prev = prevNode;

                newNode.next = currentNode;
                currentNode.prev = newNode;
                return;
            }
            count++;
            currentNode = currentNode.next;
        }

        if (currentNode == null)
            addLast(t);
    }

    public void addFirst(T t){
        Node<T> newNode = new Node<>(t);

        newNode.next = head;
        head.prev = newNode;

        head = newNode;
    }

    public void addLast(T t){
        Node<T> newNode = new Node<>(t);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void print(){
        Node<T> currentNode = head;

        while (currentNode != null){
            System.out.println(currentNode.t);
            currentNode = currentNode.next;
        }
    }

    private static class Node<T>{
        private T t;
        private Node<T> next;
        private Node<T> prev;

        public Node(T t) {
            this.t = t;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "t=" + t +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }
    }
}
