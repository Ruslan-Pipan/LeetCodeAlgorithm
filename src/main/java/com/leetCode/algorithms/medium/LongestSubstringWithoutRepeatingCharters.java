package com.leetCode.algorithms.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharters {

    public static int lengthLongerSubstring(String s){
        HashSet<Character> characters = new HashSet<>();

        int max = 0;
        int count = 0;
        int currentPosition = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!characters.contains(chars[i])){
                characters.add(chars[i]);
                ++count;
            }else {
                characters.clear();
                if (count > max) max = count;
                count = 0;
                i = currentPosition++;
            }
        }

        return Math.max(max, count);
    }

    public static void main(String[] args) {
        System.out.println(lengthLongerSubstring(" "));
    }
}
