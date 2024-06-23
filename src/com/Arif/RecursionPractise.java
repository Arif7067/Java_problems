package com.Arif;

public class RecursionPractise {
    public static void main(String[] args) {
//        System.out.println(fibo(8));
        int[] arr ={0,1,11,22,33,44,55,66,77,88,99};
        System.out.println(binarySearch(arr,77,0,arr.length-1));
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static int binarySearch(int [] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }

        int m= start +(end -start)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return binarySearch(arr,target,start,m-1);
        }
        return binarySearch(arr,target,m+1,end);
    }
}
