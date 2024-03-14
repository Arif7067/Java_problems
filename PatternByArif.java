package com.leetcode;

public class PatternByArif {
    public static void main(String[] args){
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(9);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
        pattern12(5);


    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        if(n%2==0){
            for(int i=1;i<=n;i++){
                if(i<=n/2){
                    for (int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                } else {
                    for (int j=n/2;j>=i-(n/2);j--){
                        System.out.print("* ");
                    }
                }

                System.out.println();
            }
        }
        if(n%2!=0) {
            for (int i = 1; i <= n; i++) {
                if (i <= n / 2) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = (n / 2)+1; j >= i - (n / 2); j--) {
                        System.out.print("* ");
                    }
                }

                System.out.println();
            }
        }

    }
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j<=n-i) {
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j<i) {
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=2*n;j++){
                if(j<=n-i) {
                    System.out.print(" ");
                } else if (n-i<j && j<n+i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<2*n;j++){
                if(j<i) {
                    System.out.print(" ");
                } else if (j<=2*n-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j<=n-i) {
                    System.out.print(" ");
                } else if (n-i<j && j<=n) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j<i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j<i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j<=n-i) {
                    System.out.print(" ");
                } else if (n-i<j && j<=n) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

}
