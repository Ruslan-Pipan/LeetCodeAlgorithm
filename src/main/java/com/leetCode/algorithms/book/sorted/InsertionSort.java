package com.leetCode.algorithms.book.sorted;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr){
        int currentElement;
        int j;


        // Зовнішня ітерація.
        for (int i = 1; i < arr.length; i++) {
            currentElement = arr[i];

            j = i - 1;

            while (j >= 0 && arr[j] <= currentElement){
                arr[j + 1] = arr[j--];
            }

            arr[j + 1] = currentElement;
        }

    }
}
