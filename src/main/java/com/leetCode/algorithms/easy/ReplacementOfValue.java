package com.leetCode.algorithms.easy;

public class ReplacementOfValue {
    public static void main(String[] args) {
        int a = 55;
        int b = 5;

        a = a + b; // 55 + 5
        b = a - b; // 60 - 5
        a = a - b; // 60 - 5

        System.out.println(a + " " + b);
    }
}
