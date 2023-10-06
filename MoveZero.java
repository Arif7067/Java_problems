//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//
//
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]



package com.leetcode;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args){
        int[] arr = {1,0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void moveZeroes(int[] arr) {
        //bigger approach
        int first_pointer = 0;
        int second_pointer = 0;
        while(second_pointer < arr.length && first_pointer < arr.length){
            while(arr[first_pointer]!=0 && first_pointer < arr.length-1 && first_pointer<second_pointer){
                first_pointer++;
            }
            while(arr[second_pointer]==0 && second_pointer < arr.length-1 ){
                second_pointer++;
            }

            int temp = arr[first_pointer];
            arr[first_pointer] = arr[second_pointer];
            arr[second_pointer]= temp;

            first_pointer++;
            second_pointer++;
        }
        // second and optyimized approach
        int k=0;
        for(int num: arr){
            if(num!=0){
                arr[k++]=num;
            }
        }
        for(;k<arr.length;k++){
            arr[k]=0;
        }


    }
}
