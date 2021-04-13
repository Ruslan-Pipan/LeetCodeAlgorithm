package com.leetCode.algorithms.book.dataStructure;

public class Linked<T> {
    private Node<T> head;

    public void add(T t, int index){
        if (index == 0){
            addFirst(t);
            return;
        }


        Node<T> currentNode = head;

        int count = 0;

        while (currentNode != null){

            if (index - 1 == count){

                Node<T> newNode = new Node<>(t);

                Node<T> tmp = currentNode.next;
                currentNode.next = newNode;
                newNode.next = tmp;

                return;
            }
            count++;
            currentNode = currentNode.next;
        }

        if (count < index)
            addLst(t);
    }

    public void addFirst(T t){
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
    }

    public void addLst(T t){
        if (head == null){
            Node<T> node = new Node<>(t);
            head = node;
            return;
        }

        Node<T> currentNode = head;

        while (currentNode.next != null)
            currentNode = currentNode.next;

        currentNode.next = new Node<>(t);

    }


    public int getIndex(T t){
        if (head == null)
            return -1;

        if (head.item.equals(t))
            return 0;

        Node<T> currentNode = head;
        int result = 0;

        while (currentNode.next != null) {
            ++result;

            if (currentNode.equals(t))
                return result;

            currentNode = currentNode.next;
        }
        return -1;
    }


    public void remove(T t){
        if (head == null)
            return;

        if (head.item.equals(t))
            head = head.next;

        Node<T> currentNode = head;

        while (currentNode.next != null){

            if (currentNode.next.item.equals(t))
                currentNode.next = currentNode.next.next;

            currentNode = currentNode.next;
        }
    }

    public T getElement(int index){
        if (head == null)
            return null;

        if (index == 0)
            return head.item;

        Node<T> currentNode = head;
        int count = 0;

        while (currentNode != null){
            if (count == index)
                return currentNode.item;

            count++;
            currentNode = currentNode.next;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Linked{" +
                "head=" + head +
                '}';
    }

    public void print() {
        Node<T> printNode = head;
        while (printNode != null){
            System.out.println(printNode.item);
            printNode = printNode.next;
        }
    }

    private static class Node<T>{
        private T item;
        private Node<T> next;

        public Node(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }
}
