package com.Arif;

import java.util.Arrays;
import java.util.Locale;

public class StringandStringBuilder {
    public static void main(String[] args){
//        String name = "Arif Hassan";
//        System.out.println(name);

//        pretty print
//        float a = 453.125f;
//        System.out.printf("Foematted number is %.2f",a);
//        System.out.printf("Foematted number is %.3f",Math.PI);
//        System.out.printf("Hello my name is %s and I am %s myself","Arif","improving");

//        String series = "";
//        for (int i=0; i<26;i++){
//            char ch = (char) ('a' + i);
//            series = series + ch;
//        }
//        System.out.println(series);


//        String Builder
//        StringBuilder builder = new StringBuilder();
//        for (int i=0; i<26;i++){
//            char ch = (char) ('a' + i);
//            builder.append(ch);
//        }
//        builder.reverse();
//        System.out.println(builder);


//        Methods in String
//        String name = "Arif Hassan";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.toLowerCase());
//        System.out.println(name);
//        System.out.println(name.indexOf('a'));
//        System.out.println("   Arif     ".strip());
//        System.out.println(Arrays.toString(name.split(" ")));


//        palindrome
        String str = null;
        System.out.println(isPalindrome(str));






//        placeholder
//                %c	character
//                %d	decimal (integer) number (base 10)
//                %e	exponential floating-point number
//                %f	floating-point number
//                %i	integer (base 10)
//                %o	octal number (base 8)
//                %s	a string of characters
//                %u	unsigned decimal (integer) number
//                %x	number in hexadecimal (base 16)
//                %t    Date/time
//                %n    Newline
//                %%	print a percent sign
//                \%	print a percent sign
    }
    static boolean isPalindrome(String str){
        if (str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for (int i=0; i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }

}
