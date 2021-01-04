package com.leetCode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * **/

public class TwoSum {

    public static int[] twoSumResolvedWithLoops(int[] nums, int target){
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No found.");
    }

    public static int[] twoSumResolvedWithMap(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int number = target-nums[i];
            System.out.println(target + " - " + nums[i] + " = " + number);
            if (map.containsValue(number) && map.get(number) != i)
                return new int[] {map.get(number),i};
        }
        throw new IllegalArgumentException("No found.");
    }

    public static void main(String[] args) {
        int[]nums = {3,2,4};
        int target = 6;
        int[] result =  twoSumResolvedWithMap(nums,target);

        for(int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
