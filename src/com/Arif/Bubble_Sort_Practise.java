package com.Arif;

import java.util.Arrays;

public class Bubble_Sort_Practise {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
    static int[] bubbleSort(int [] arr){
        boolean swapped;
        for (int j=0;j<arr.length;j++) {
            swapped = false;
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] < arr[i -1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
        return arr;
    }
}
