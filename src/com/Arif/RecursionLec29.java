package com.Arif;

import java.util.Arrays;

public class RecursionLec29 {
    public static void main(String[] args) {
//        pattern(4);
//        System.out.print("abcs");
//        triangle2(4,0);
        int[] arr = {1,3,2,5,7,6,9,8};
//        bubbleSort(arr, arr.length-1,0);
        selectionSort(arr, arr.length,0,0 );
        System.out.println(Arrays.toString(arr));
    }
    private static void triangle2(int i, int i1) {
        if(i==0){
            return;
        }
        if(i>i1){
            triangle2(i,i1+1);
            System.out.print("* ");
        } else{

            triangle2(i-1,0);
            System.out.println();

        }


    }

    private static void pattern(int i) {
        helper(i,0);
    }

    private static void helper(int i, int i1) {
        if(i==0){
            return;
        }
        if(i>i1){
            System.out.print("* ");
            helper(i,i1+1);
        } else{
            System.out.println();
            helper(i-1,0);
        }


    }




    private static void bubbleSort(int[] arr, int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]> arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r,c+1);
        } else{
            bubbleSort(arr,r-1,0);
        }
    }

    private static void selectionSort(int[] arr, int r, int c, int max) {
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]> arr[max]){
                selectionSort(arr,r,c+1,c);
            } else{
                selectionSort(arr,r,c+1,max);
            }

        } else{
            int x = arr[r-1];
            arr[r-1] = arr[max];
            arr[max] = x;
            selectionSort(arr,r-1,0,0);
        }
    }


}
