package com.leetcode;
//268. Missing Number
//        Companies
//        Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.     Example 1:
//
//        Input: nums = [3,0,1]
//        Output: 2
//        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//        Example 2:
//
//        Input: nums = [0,1]
//        Output: 2
//        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//        Example 3:
//
//        Input: nums = [9,6,4,2,3,5,7,0,1]
//        Output: 8
//        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
import java.util.Arrays;

class MissingNumber {
    public static void main(String [] args){
        int []arr = {9,6,4,2,3,5,7,0,1};
        int ans = cyclicSort(arr);
        System.out.println(ans);
    }
//    public static int  missingNumber(int[] arr) {
//
//    }

    static int  cyclicSort(int[] arr){
        int i=0;
        while(i< arr.length){
            if(arr[i]< arr.length && arr[i]!=arr[arr[i]]){
                swap(arr,i,arr[i]);
            } else{
                i++;
            }
        }
        for (int j =0; j< arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }
}