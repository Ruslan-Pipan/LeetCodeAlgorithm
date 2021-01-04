package com.leetCode.algorithms;

/**
 *Determine whether an integer is a palindrome.
 *An integer is a palindrome when it reads the same backward as forward.
 *
 *Example 1:
 * Input: x = 121
 * Output: true
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121.
 * From right to left, it becomes 121-.
 * Therefore it is not a palindrome.
 * **/


public class PalindromeNumber {
    public static boolean isPalindromeByString(int x){
        String number = Integer.toString(x);
        StringBuilder numberRevers = new StringBuilder(number).reverse();
        return number.equals(numberRevers.toString());
    }

    public static boolean isPalindrome(int x){
        if (x < 0)
            return false;
        int copyOfx = x;
        int reverseNumber = 0;

        while (copyOfx != 0){
            int pop = copyOfx % 10;
            copyOfx /= 10;
            reverseNumber = reverseNumber * 10 + pop;
        }
        return x == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
