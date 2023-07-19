//For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
//
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.


import java.util.*;

public class GreatestCommonDivisorofStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()){
            return gcdOfStrings(str2,str1);
        }
        if(str2.equals(str1)){
            return str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }
        return "";

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        String word = gcdOfStrings(word1, word2);
        System.out.println("The greatest common divisor of two strings is :" + word);

    }
}
