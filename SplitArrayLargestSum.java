package com.leetcode;
//Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//
//        Return the minimized largest sum of the split.
//
//        A subarray is a contiguous part of the array.
//Example 1:
//
//        Input: nums = [7,2,5,10,8], k = 2
//        Output: 18
//        Explanation: There are four ways to split nums into two subarrays.
//        The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
//        Example 2:
//
//        Input: nums = [1,2,3,4,5], k = 2
//        Output: 9
//        Explanation: There are four ways to split nums into two subarrays.
//        The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr = {7,2,5,10,8};
        int m =2;
        int ans = splitArray(arr,m);
        System.out.println(ans);
    }
    static int splitArray(int[] arr, int m){
        int start=0;
        int end =0;
        for(int i=0; i<arr.length; i++){
            start = Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end){
            int mid = start + (end-start)/2;
            int sum =0;
            int pieces=1;
            for(int num : arr){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                } else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start = mid+1;
            } else{
                end=mid;
            }
        }

        return end;
    }
}
