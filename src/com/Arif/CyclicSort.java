package com.Arif;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String [] args){
        int [] arr = {3,4,1,2,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]-1!=i){
                swap(arr,arr[i]-1,i);
            }
        }
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }
}
