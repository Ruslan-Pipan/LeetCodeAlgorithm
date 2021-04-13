package com.leetCode.algorithms.book.search;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,3,7,9,55,472,777};
        System.out.println(sort(7,arr));
    }

    public static int sort(int key, int[] arr){
        return sort(key,arr,0,arr.length - 1);
    }
    private static int sort(int key, int[] arr, int start, int last){
        if (start > last) return - 1;

        int mid = start + (last - start) / 2;

        if (key < arr[mid]) return sort(key,arr,start, mid -1 );
        else if (key > arr[mid]) return sort(key,arr,mid-1, last);
        else return mid;
    }
}
// 0 - (7 - 0) / 2;