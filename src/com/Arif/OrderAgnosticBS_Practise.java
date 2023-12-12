package com.Arif;

public class OrderAgnosticBS_Practise {
    public static void main (String [] args){
//        int[] arr = {-89,-19,-11,-5,0,2,4,6,8,9,10,22,45,67,89,90,95,98};
        int[] arr = {98,89,14,12,0,-1,-8,-19};
        int target = -1;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]) {
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }  else {
                if(target<arr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;

    }
}
