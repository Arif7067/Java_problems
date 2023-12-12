package com.Arif;

import java.util.Scanner;

public class function_Practise {

    public static void main(String[] args){

//        int ans = sum();
//        System.out.println("The sum is : " + ans);
        boolean ans = arm_strong(153);
        System.out.println(ans);

    }

    static int sum(){
        System.out.println("Enter values to find sum");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = input.nextInt();
        System.out.print("Enter the second value : ");
        int b = input.nextInt();
        int sum = a+b;

        return sum;
    }

    static boolean arm_strong(int a){
        int x =0;
        int p=0;
        int y = a;
        while(a > 0){
            p = a%10;
            x += p*p*p;
            a=a/10;
        }
//        p = a%10;
//        x+=p*p*p;
        return (x==y);
    }
}
