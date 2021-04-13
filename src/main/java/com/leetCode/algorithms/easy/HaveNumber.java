package com.leetCode.algorithms.easy;

public class HaveNumber {
    public static void main(String[] args) {
        String s = "kj0jklds";

        System.out.println(haveNumber(s));
    }

    public static boolean haveNumber(String s){

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9')
                return true;
        }

        return false;
    }
}
