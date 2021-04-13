package com.leetCode.algorithms.easy;

public class ReverseString {


    public static void main(String[] args) {
        String string = "adsg575hgfj";
        char[] chars = string.toCharArray();
        char tmp;
        int j = chars.length - 1;

        for (int i = 0; i < j; i++){
            tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            --j;
        }

        string = String.copyValueOf(chars);

        System.out.println(string);
    }
}
