package com.Arif;

public class mathlec25 {
    public static void main(String[] args) {
//        System.out.println(isodd(68));

//        find unique no.
//        int[] arr = {2,3,4,1,2,1,3,6,4};
//        System.out.println(ans(arr));

//        find ith bit of a no.
//        int number = 6;
//        System.out.println(ithbit(number, 3));

//        int[] arr = {2,2,3,2,7,7,8,7,8,8};/// not ble to find 1:22:30
//        System.out.println(uniqueno(arr));


//        find n magic no.
//        int n =5;
//        System.out.println(magicno(n));

//        number of digits
//
//        int n = 34567;
//        int b = 10;
//
//        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
//
//        System.out.println(ans);


//        power of 2
        int n =31;  // n=0 make it return false
        boolean ans = (n & (n-1)) ==0;
        System.out.println(ans);
    }

    private static int magicno(int n){
        int ans=0;
        int base =5;
        while(n>0){
            int last = n&1;
            ans+=last*base;
            base *= 5;
            n=n>>1;
        }
        return ans;
    }

    private static int ithbit(int n, int bit){
        return (n & (1<<(bit-1)));
    }

    private static int ans(int[] arr){
        int unique =0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }

    private static boolean isodd(int n){
        return ((n&1)==1);
    }

    private static int uniqueno(int[] arr){
        int sum =0;
        for(int i:arr){
            sum +=arr[i];
        }
        return sum; /// not working
    }
}
