package com.leetCode.algorithms.medium.addTwoNumbers;

public class Algorithm {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5,new ListNode(6, new ListNode(4)));
        ListNode node = addTwoNumbers(listNode1, listNode2);
        System.out.println(node);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode answer = new ListNode();
        ListNode curr = answer;

        int tmp = 0;

        while (l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + tmp;

            tmp = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            l1 = l1 == null ? null: l1.next;
            l2 = l2 == null ? null: l2.next;

        }
        if (tmp != 0) curr.next = new ListNode(1);

        return answer.next;
    }

}
/*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order, and each of their nodes contains a single digit.
* Add the two numbers and return the sum as a linked list.
* Input: l1 = [2,4,3], l2 = [5,6,4]
* Output: [7,0,8]
*
* */