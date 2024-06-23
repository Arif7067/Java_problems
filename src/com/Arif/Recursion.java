package com.Arif;

public class Recursion {
    public static void main(String[] args){
//        fibonacci(12,0,1);
        System.out.println(fibo(6));
//        int[] arr = {1,2,3,4,55,66,78,99,100};
//        int target = 3;
//        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    static void fibonacci(int n,int a,int b){

        System.out.println(a+b);
        n=n-1;
        if(n>0){
            fibonacci(n, b,a+b);
        }

    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    static int binarySearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return binarySearch(arr,target,s,m-1);
        }

        return binarySearch(arr,target,m+1,e);
    }
}
