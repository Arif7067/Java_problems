package com.Arif;

public class Recursionlec27 {
    public static void main(String[] args) {
//        funBoth(5);
//        System.out.println(factorial(5));
//        System.out.println(sumN(5));
//        System.out.println(sumDigits(1342));
//        reverseNo(12345);
//        System.out.println(p);
//        System.out.println(rev(12345));
//        System.out.println(palindrome(1231));
//        noZero(30104);
//        System.out.println(count);
        System.out.println(count(30105036));
    }

    static int count(int n){
        return helperc(n,0);
    }
/// speciial pattern, how to pass a value to above calls
    private static int helperc(int n, int c) {
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helperc(n/10,c+1);
        }
        return helperc(n/10,c);
    }

    static int count =0;
    static int noZero(int n){
        if(n==0){
            return 0;
        }

        if(n%10==0){
            count +=1;           ;
        }

        return noZero(n/10);
    }
    static boolean palindrome(int n){
        return n==rev(n);
    }
    static int p=0;
    static void reverseNo(int n){
//        int p=0;
        if(n==0){
            return;
        }

        p = p*10 + n%10;
        reverseNo(n/10);
    }
    static int rev(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return  rem*(int)Math.pow(10,digits-1) + helper(n/10, digits-1);
    }

    static int sumDigits(int n){
        if(n%10==n){
            return n;
        }
        int p = n%10;
        return p+ sumDigits(n/10);
    }

    static int sumN(int n){
        if(n==1){
            return n;
        }
        return n+ sumN(n-1);
    }
    static int factorial(int n){
        if(n==1 | n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
