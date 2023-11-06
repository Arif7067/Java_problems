package com.leetcode;

public class FindInMountainArray {
    public static void main (String [] args){
        int [] mountainArr = {0,5,3,1};
        int target = 1;
        int ans = serachInMountain(target, mountainArr);
        System.out.println(ans);
    }

    static int serachInMountain(int target, int[] arr){
        int peak = findInMountainArray(arr);
        int ans = binarySearch(arr, target,0,peak);
        if(ans!=-1){
            return ans;
        }
        return binarySearch(arr,target,peak+1,arr.length-1);
    }
    static int findInMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length- 1;
        while(start<end){
            int mid = start + (end-start)/2;
            if (mountainArr[mid]>mountainArr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return  start;

    }
    static int binarySearch(int [] mountainArr, int target,int start, int end){
        boolean isAsc = mountainArr[start]<mountainArr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target==mountainArr[mid]) {
                return mid;
            }
            if (isAsc){
                if(target<mountainArr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }  else {
                if(target<mountainArr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;

    }
}



//optimized one
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(mountainArr, target, peak+1, mountainArr.length() - 1);

    }
    int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1;
            }
        }
        return start;
    }
    int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target < mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}