package com.Arif;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {9,10,4,6,3,8,2,0};
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for (int i=0; i< arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }

    static void insertionSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                } else{
                    break;
                }
            }
        }
    }

    private static int getMaxIndex(int[] arr, int start,int end) {
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }
}
