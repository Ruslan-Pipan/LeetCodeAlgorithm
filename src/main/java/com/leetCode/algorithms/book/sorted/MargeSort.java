package com.leetCode.algorithms.book.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MargeSort {

    private int[] marge(int[] arr1, int[] arr2, int[] sorted){


        int indexa = 0, indexb = 0;

        for (int indexSort = 0; indexSort < sorted.length; indexSort++) {

            if (arr1.length == indexa){

                while (indexb < arr2.length)
                    sorted[indexSort++] = arr2[indexb++];

                return sorted;
            }else if (arr2.length == indexb){

                while (indexa < arr1.length)
                    sorted[indexSort++] = arr1[indexa++];

                return sorted;
            }

            if (arr1[indexa] < arr2[indexb]){
                sorted[indexSort] = arr1[indexa++];

            }else if (arr1[indexa] == arr2[indexb]){
                sorted[indexSort] = arr1[indexa++];
                sorted[indexSort] = arr2[indexb++];

            }else if (arr1[indexa] > arr2[indexb]){
                sorted[indexSort] = arr2[indexb++];
            }

        }
       return sorted;

    }


}
