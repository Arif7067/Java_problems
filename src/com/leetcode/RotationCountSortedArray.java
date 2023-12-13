package com.leetcode;

public class RotationCountSortedArray {
    public static void main(String [] args){
        int []arr = {4,4,5,6,6,7,0,1,2};
        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[] arr) {
        int end = arr.length-1;
        int peak = findpeak(arr);
//        if(peak==-1){
//            return 0;
//        }
        return peak+1;
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
}
