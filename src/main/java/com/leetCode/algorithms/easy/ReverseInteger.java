package com.leetCode.algorithms.easy;
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

    public static int reversResolvedByDivision(int x){
        long result = 0;
        while (x != 0){
          int pop = x % 10;
          x/=10;
          result = result * 10 + pop;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(reversResolvedByDivision(
                123));
    }

}
