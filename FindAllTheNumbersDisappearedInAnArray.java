package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllTheNumbersDisappearedInAnArray {
    public void main(String[] args){
        int []  arr = {4,3,2,7,8,2,3,1};
        System.out.println(missingArrayNumber(arr));
    }
    List<Integer> missingArrayNumber(int [] arr){
        int i=0;
        while(i< arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            } else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j =0; j< arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;

    }
     void swap(int[] arr, int first, int last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }
}