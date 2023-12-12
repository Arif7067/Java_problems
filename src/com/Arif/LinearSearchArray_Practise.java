package com.Arif;

import java.util.Arrays;

public class LinearSearchArray_Practise {
    public static void main(String[] args){
//        int[] arr = {1,4,77,99,23,45,67,02,70,100};
//        System.out.println(linearSearch(arr,1000000));
        int[] [] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 0;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(1771%10);

    }

    static int[] search(int[][]arr, int target){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j< arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }












//    static int linearSearch(int[] arr, int target){
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }

//    static int linearSearch(int[] arr, int target){
//        for(int num : arr){
//            if(num == target){
//                return num;
//            }
//        }
//        return -1;
//    }
//    static boolean linearSearch(int[] arr, int target){
//        for(int num : arr){
//            if(num == target){
//                return true;
//            }
//        }
//        return false;
//}



}
