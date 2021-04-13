package com.leetCode.algorithms.hard;

import java.util.Arrays;

public class MedianToSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] result = marge(nums1, nums2);

        if (result.length % 2 != 0)
            return result[result.length / 2];
        else{
            int index = result.length / 2;
            return (result[index] + result[--index]) / 2.0;
        }

    }
    public static int[] marge(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length + nums2.length];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (index1 == nums1.length){
                result[i] = nums2[index2++];
                continue;
            }

            if (index2 == nums2.length){
                result[i] = nums1[index1++];
                continue;
            }

            if (nums1[index1] < nums2[index2])
                result[i] = nums1[index1++];
            else
                result[i] = nums2[index2++];

        }
        return result;
    }
}
/*
* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
* Input: nums1 = [1,3], nums2 = [2]
* Output: 2.00000
*
* Or
*
* Input: nums1 = [1,2], nums2 = [3,4]
* Output: 2.50000
* */