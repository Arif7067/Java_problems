package com.leetcode;
//Find the element of infinite length sorted array
public class InfiniteArray {
    public static void main (String [] args){
        int [] arr = {1,3,5,7,8,9,10,11,13,16,17,19,20,23,24,27,29,30,35,37,39,40,46,47,48,49,50,51,52,54,56,58,59,60};
        int answer = searchRange(arr, 39);
        System.out.println(answer);

    }
    static int searchRange(int [] arr, int target){
        int start =0;
        int end =1;
        while(target > arr[end]){
            int newS = end+1;
            end = end + (end - start +1)*2;
            start = newS;
        }
        int ans = binarySearch(arr, target,start, end);
        return ans;
    }
    static int binarySearch(int [] arr, int target , int start, int end){
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
