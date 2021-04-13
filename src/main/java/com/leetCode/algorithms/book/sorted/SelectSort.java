package com.leetCode.algorithms.book.sorted;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4,7,6,78,7,24,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int min;

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
}
