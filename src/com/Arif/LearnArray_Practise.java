package com.Arif;

import java.util.Arrays;

public class LearnArray_Practise {
    public static void main(String[] args){
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//
//        for (int i=0; i<3; i++){
//            list.add(new ArrayList<>());
//        }
//        for (int i=0; i<3;i++){
//            for(int j=0; j<3; j++){
//                list.get(i).add(in.nextInt());
//            }
//        }
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        swap(arr, 1,2);
        reverse(arr);
        int maximum_value = maxmum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(maximum_value);

    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static int maxmum(int[] arr){
        int max = 0;
        for(int i=0; i< arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return  max;
    }
}
