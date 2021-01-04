package com.leetCode.algorithms;
/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Note:
 * Assume we are dealing with an environment that could only store integers within
 * the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * **/
public class ReverseInteger {

    public static int reversResolvedByString(int x){
        StringBuilder revers = new StringBuilder(Integer.toString(x)).reverse();
        return Integer.parseInt(revers.toString());
    }

    public static int reversResolvedByDivision(int x){
        int result = 0;
        while (x != 0){
          int pop = x % 10;
          x/=10;
          System.out.println(result = result * 10 + pop);
        }
        return 0;
    }

    public static void main(String[] args) {
        reversResolvedByDivision(123);
    }

}
