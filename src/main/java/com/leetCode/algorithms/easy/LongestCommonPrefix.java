package com.leetCode.algorithms.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] str){

        if (str == null || str.length == 0) return "";

        for (int i = 0; i < str[0].length(); i++) {
            char c = str[0].charAt(i);

            for (int j = 1; j < str.length; j++) {
                if (i == str[j].length() || str[j].charAt(i) != c)
                    return str[0].substring(0,i);
            }

        }
        return str[0];
    }
}
/*
* Write a function to find the longest common prefix string amongst an array of strings.
* Input: strs = ["flower","flow","flight"]
* Output: "fl"
*
*
* */