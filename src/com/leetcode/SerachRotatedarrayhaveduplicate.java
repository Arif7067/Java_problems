package com.leetcode;

public class SerachRotatedarrayhaveduplicate {
    public static void main(String [] args){
        int []arr = {4,4,5,6,6,7,0,1,2};
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
            if(mountainArr[mid]==mountainArr[start] && mountainArr[mid]==mountainArr[end]){
                if(mountainArr[start]>mountainArr[start+1]){
                    return start+1;
                }
                start++;
                if(mountainArr[end]<mountainArr[end-1]){
                    return end;
                }
                end--;
            } else if (mountainArr[start]<mountainArr[mid] || (mountainArr[start]==mountainArr[mid] && mountainArr[mid]>mountainArr[end])) {
                start = mid+1;
            } else {
                end = mid-1;
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
