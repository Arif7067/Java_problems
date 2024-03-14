package com.patterns;

public class patternByKunal {
    public static void main(String[] args){
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
        pattern5(9);

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

}
