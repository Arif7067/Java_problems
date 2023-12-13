//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



import java.util.Scanner;

public class ReverseVowelOfAString {
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
    public static String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = n-1;
        while(start<end){
            if(!isVowel(ch[start])){
                start++;
            } else if(!isVowel(ch[end])){
                end--;
            }
            else{
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseVowels(s));
    }
}
