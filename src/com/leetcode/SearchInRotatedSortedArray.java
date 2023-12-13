package com.leetcode;
//There is an integer array nums sorted in ascending order (with distinct values).
//
//        Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//        Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
public class SearchInRotatedSortedArray {
    public static void main(String [] args){
        int []arr = {4,5,6,7,0,1,2};
        int target =1;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int end = arr.length-1;
        int peak = findpeak(arr);
        if(peak==-1){
            return binarySearch(arr,target,0, arr.length-1);
        }
        if(target==arr[peak]){
            return peak;
        }
        if(target<arr[0]){
            return binarySearch(arr,target,peak+1,end);
        }
        return binarySearch(arr,target,0,peak-1);
    }
    static int findpeak(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length- 1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && mountainArr[mid] > mountainArr[mid + 1]) {
                return mid;
            }
            if (mid > start && mountainArr[mid] < mountainArr[mid - 1]) {
                return mid - 1;
            }
            if (mountainArr[start] >= mountainArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return  -1;

    }

    static int binarySearch(int [] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else if (target==arr[mid]) {
                return mid;
            }
        }
        return -1;

    }
}
