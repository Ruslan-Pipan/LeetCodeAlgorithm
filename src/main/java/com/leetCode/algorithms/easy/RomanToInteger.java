package com.leetCode.algorithms.easy;


import java.util.Arrays;

/**
 * Roman numerals
 * are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 *Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * Example 1:
 * Input: s = "III"
 * Output: 3
 *
 * Example 2:
 * Input: s = "IV"
 * Output: 4
 *
 * Example 5:
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * **/
public class RomanToInteger {

    private final char[] symbol = new char[]{'I','V','X','L','C','D','M'};
    private final int[] value = new int[]{1,5,10,50,100,500,1000};
    private int result = 0;


    /**
     * When we received array int, we compare index[0] to index[1]
     * if index[0] > index[1] we subtract from result else we add.
     *
     * **/

    public int romanToInt(String s){
        int[] index = giveIndexByString(s);

        for (int i = 0; i < s.length(); i++){
            if (i < s.length() - 1 && value[index[i]] < value[index[i + 1]])
                result -= value[index[i]];
            else result += value[index[i]];
        }
        return result;
    }

    /**
     * This method give index Value by String.
     *
     * Example: We have String: IXL;
     *
     *
     * I = 0 index;
     * X = 2 index;
     * l = 3 index;
     *
     * So we get array int{0,2,3};
     * ***/
    private int[] giveIndexByString(String s){

        char[] chars = s.toCharArray();
        int[] index = new int[20];
        Arrays.fill(index, -1);

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < symbol.length; j++){
                if(chars[i] == symbol[j]){
                    index[i] = j;
                }
            }
        }

        return index;
    }
}
