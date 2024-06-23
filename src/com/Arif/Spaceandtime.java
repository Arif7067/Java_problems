package com.Arif;
//import java.util.*;

public class Spaceandtime {
    public static void main(String args[]){
        for (int i=0; i<11;i++){
            System.out.println(fuboformulae(i));
        }


    }
    static int fuboformulae(int n){
        return (int) (Math.pow(((1 + Math.sqrt(5))/2), n)/Math.sqrt(5)) ;
    }
}
