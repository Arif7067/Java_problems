package com.Arif;

import java.util.Arrays;

public class sortedMatrix_Practise {
    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(matrix, 11)));

    }
    //serach in the row between the columns provided
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart)/2 ;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }

        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols =matrix[0].length; // be cautious matrix may be empty
        int s = matrix[0].length-1;

        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }

        int rStart =0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while(rStart<(rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            } else{
                rEnd=mid;
            }
        }


        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,rEnd};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,rEnd};
        }

        if (matrix[rStart][cMid-1]>=target) {
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }else if(matrix[rStart][cMid]<target && matrix[rStart][s]>target){
            return binarySearch(matrix,rStart,cMid+1,matrix[rStart].length-1,target);
        }else if(matrix[rStart+1][cMid]>target){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        } else if(matrix[rStart+1][cMid+1]<=target){
            return binarySearch(matrix,rStart+1,cMid+1,s,target);
        }

        return new int[]{-1,-1};
    }
}
