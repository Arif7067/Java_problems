package com.Arif;

import java.util.ArrayList;

public class Recursionlec28 {
    public static void main(String[] args) {
//        int[] arr = {2,4,5,4,8,9};
//        System.out.println(isSort(arr,0));
//        System.out.println(linearSearch(arr,3,0));
//        findAllIndex(arr,3,0);
//        System.out.println(list);
//        System.out.println(findAllIndexList(arr,4,0,new ArrayList<>()));
//        ArrayList<Integer> ans = findAllIndexList(arr,4,0,new ArrayList<>());
//        System.out.println(ans);
//        System.out.println(finAllIndex2(arr,4,0));
        int [] arr = {5,6,7,8,9,1,2,3};
    }

    //linear serach
    private static int linearSearch(int[] arr, int target, int index){
        if(target==arr[index]){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        return linearSearch(arr,target,index+1);
    }

    // find all index
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index ==arr.length){
            return;
        }

        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
    //other way
    static ArrayList findAllIndexList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index ==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndexList(arr,target,index+1, list);
    }

    // find again but creating multiple list
    static ArrayList<Integer> finAllIndex2(int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length-1){
            return list;
        }
        if(target== arr[index]){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = finAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
    //check if its sort or not
    private static boolean isSort(int[] arr, int index){
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]< arr[index+1]){
            return isSort(arr,index+1);
        };
        return false;
    }
}
