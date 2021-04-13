package com.leetCode.algorithms.book.dataStructure;

public class StackByLinked<T> {

    private Node<T> head;

    public void push(T t){
        Node<T> newNode = new Node<>(t);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public T pop(){
        if (head == null)
            return null;

        Node<T> tmp = head;
        head = head.next;

        return tmp.t;
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

        public Node(T t) {
            this.t = t;
        }
    }
}
